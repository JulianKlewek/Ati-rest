package pl.klewek.atipera.service;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import pl.klewek.atipera.exception.InvalidHeaderException;
import pl.klewek.atipera.exception.UsernameNotFoundException;
import pl.klewek.atipera.model.BranchDto;
import pl.klewek.atipera.model.RepositoryDto;
import pl.klewek.atipera.model.github.Branch;
import pl.klewek.atipera.model.github.Repository;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Service
public class GithubService {

    private final WebClient webClient;

    public GithubService(WebClient.Builder builder){
        webClient = builder
                .baseUrl("https://api.github.com/")
                .build();
    }

    public RepositoryDto[] getRepositories(String username){
        String repoUri = "users/" + username + "/repos";
        RepositoryDto[] result;

        Repository[] repositories = webClient
                .get()
                .uri(repoUri)
                .retrieve()
                .onStatus(
                        HttpStatus.NOT_FOUND::equals,
                        clientResponse -> clientResponse.bodyToMono(String.class)
                                .flatMap(error -> Mono.error(new UsernameNotFoundException(username)))
                )
                .bodyToMono(Repository[].class)
                .block();

        result = fetchRepositoriesAndOwners(repositories).toArray(new RepositoryDto[0]);
        return result;
    }

    private List<RepositoryDto> fetchRepositoriesAndOwners(Repository[] repositories) {
        Predicate<Repository> isNotForkPredicate = repository -> !repository.fork;
        List<Repository> repositoryList = Arrays.asList(repositories);
        List<RepositoryDto> repositoryDtoList = new ArrayList<>();

        repositoryList.stream()
                .filter(isNotForkPredicate)
                .forEach(repository -> {
                    repositoryDtoList.add(RepositoryDto.builder()
                            .name(repository.getName())
                            .ownerLogin(repository.owner.getLogin())
                            .branchDtoList(getBranchesByOwnerAndRepo(repository.owner.getLogin(), repository.getName()))
                            .build());
                });

        return repositoryDtoList;
    }

    private List<BranchDto> getBranchesByOwnerAndRepo(String login, String repoName) {
        String branchesUri = "repos/" + login + "/" + repoName + "/branches";
        List<BranchDto> branchDtoList = new ArrayList<>();

        Branch[] branches = webClient.get()
                .uri(branchesUri)
                .retrieve()
                .bodyToMono(Branch[].class).block();

        Arrays.stream(branches)
                .forEach(branch -> {
                    branchDtoList.add(BranchDto.builder()
                            .name(branch.getName())
                            .lastCommitSha(branch.commit.getSha())
                            .build());
                });

        return branchDtoList;
    }
}
