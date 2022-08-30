package pl.klewek.atipera.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.io.Serializable;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonProperty("Branch name")
    private String name;
    @JsonProperty("Commit sha")
    private String lastCommitSha;
}
