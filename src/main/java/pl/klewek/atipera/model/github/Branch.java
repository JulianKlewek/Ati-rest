
package pl.klewek.atipera.model.github;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "commit",
    "protected",
    "protection",
    "protection_url"
})
@Generated("jsonschema2pojo")
public class Branch {

    @JsonProperty("name")
    public String name;
    @JsonProperty("commit")
    public Commit commit;
    @JsonProperty("protected")
    public Boolean isProtected;
    @JsonProperty("protection")
    public Protection protection;
    @JsonProperty("protection_url")
    public String protectionUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public Boolean getProtected() {
        return isProtected;
    }

    public void setProtected(Boolean aProtected) {
        isProtected = aProtected;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    public String getProtectionUrl() {
        return protectionUrl;
    }

    public void setProtectionUrl(String protectionUrl) {
        this.protectionUrl = protectionUrl;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
