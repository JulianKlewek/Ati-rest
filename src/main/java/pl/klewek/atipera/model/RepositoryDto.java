package pl.klewek.atipera.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.io.Serializable;
import java.util.List;

@Builder
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RepositoryDto implements Serializable {

    private static final long serialVersionUID = 2L;
    @JsonProperty("Repository Name")
    private String name;
    @JsonProperty("Owner Login")
    private String ownerLogin;
    @JsonProperty("Branches")
    private List<BranchDto> branchDtoList;

}
