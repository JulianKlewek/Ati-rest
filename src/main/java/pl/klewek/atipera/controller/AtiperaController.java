package pl.klewek.atipera.controller;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.klewek.atipera.exception.UsernameNotFoundException;
import pl.klewek.atipera.service.GithubService;

@RestController
@RequestMapping(path = {"/atipera"})
public class AtiperaController {

    private final GithubService githubService;

    public AtiperaController(GithubService githubService) {
        this.githubService = githubService;
    }

    @GetMapping(value = "/{username}",   consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getRepositories(@PathVariable String username, @RequestHeader(value = "Accept") String headerAccept)
            throws UsernameNotFoundException{

            return ResponseEntity.ok(githubService.getRepositories(username));
    }
}
