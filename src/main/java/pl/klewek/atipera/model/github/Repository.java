
package pl.klewek.atipera.model.github;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "node_id",
    "name",
    "full_name",
    "owner",
    "private",
    "html_url",
    "description",
    "fork",
    "url",
    "archive_url",
    "assignees_url",
    "blobs_url",
    "branches_url",
    "collaborators_url",
    "comments_url",
    "commits_url",
    "compare_url",
    "contents_url",
    "contributors_url",
    "deployments_url",
    "downloads_url",
    "events_url",
    "forks_url",
    "git_commits_url",
    "git_refs_url",
    "git_tags_url",
    "git_url",
    "issue_comment_url",
    "issue_events_url",
    "issues_url",
    "keys_url",
    "labels_url",
    "languages_url",
    "merges_url",
    "milestones_url",
    "notifications_url",
    "pulls_url",
    "releases_url",
    "ssh_url",
    "stargazers_url",
    "statuses_url",
    "subscribers_url",
    "subscription_url",
    "tags_url",
    "teams_url",
    "trees_url",
    "clone_url",
    "mirror_url",
    "hooks_url",
    "svn_url",
    "homepage",
    "language",
    "forks_count",
    "stargazers_count",
    "watchers_count",
    "size",
    "default_branch",
    "open_issues_count",
    "is_template",
    "topics",
    "has_issues",
    "has_projects",
    "has_wiki",
    "has_pages",
    "has_downloads",
    "archived",
    "disabled",
    "visibility",
    "pushed_at",
    "created_at",
    "updated_at",
    "permissions",
    "template_repository"
})
@Generated("jsonschema2pojo")
@Getter
@Setter
public class Repository {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("node_id")
    public String nodeId;
    @JsonProperty("name")
    public String name;
    @JsonProperty("full_name")
    public String fullName;
    @JsonProperty("owner")
    public Owner owner;
    @JsonProperty("private")
    public Boolean isPrivate;
    @JsonProperty("html_url")
    public String htmlUrl;
    @JsonProperty("description")
    public String description;
    @JsonProperty("fork")
    public Boolean fork;
    @JsonProperty("url")
    public String url;
    @JsonProperty("archive_url")
    public String archiveUrl;
    @JsonProperty("assignees_url")
    public String assigneesUrl;
    @JsonProperty("blobs_url")
    public String blobsUrl;
    @JsonProperty("branches_url")
    public String branchesUrl;
    @JsonProperty("collaborators_url")
    public String collaboratorsUrl;
    @JsonProperty("comments_url")
    public String commentsUrl;
    @JsonProperty("commits_url")
    public String commitsUrl;
    @JsonProperty("compare_url")
    public String compareUrl;
    @JsonProperty("contents_url")
    public String contentsUrl;
    @JsonProperty("contributors_url")
    public String contributorsUrl;
    @JsonProperty("deployments_url")
    public String deploymentsUrl;
    @JsonProperty("downloads_url")
    public String downloadsUrl;
    @JsonProperty("events_url")
    public String eventsUrl;
    @JsonProperty("forks_url")
    public String forksUrl;
    @JsonProperty("git_commits_url")
    public String gitCommitsUrl;
    @JsonProperty("git_refs_url")
    public String gitRefsUrl;
    @JsonProperty("git_tags_url")
    public String gitTagsUrl;
    @JsonProperty("git_url")
    public String gitUrl;
    @JsonProperty("issue_comment_url")
    public String issueCommentUrl;
    @JsonProperty("issue_events_url")
    public String issueEventsUrl;
    @JsonProperty("issues_url")
    public String issuesUrl;
    @JsonProperty("keys_url")
    public String keysUrl;
    @JsonProperty("labels_url")
    public String labelsUrl;
    @JsonProperty("languages_url")
    public String languagesUrl;
    @JsonProperty("merges_url")
    public String mergesUrl;
    @JsonProperty("milestones_url")
    public String milestonesUrl;
    @JsonProperty("notifications_url")
    public String notificationsUrl;
    @JsonProperty("pulls_url")
    public String pullsUrl;
    @JsonProperty("releases_url")
    public String releasesUrl;
    @JsonProperty("ssh_url")
    public String sshUrl;
    @JsonProperty("stargazers_url")
    public String stargazersUrl;
    @JsonProperty("statuses_url")
    public String statusesUrl;
    @JsonProperty("subscribers_url")
    public String subscribersUrl;
    @JsonProperty("subscription_url")
    public String subscriptionUrl;
    @JsonProperty("tags_url")
    public String tagsUrl;
    @JsonProperty("teams_url")
    public String teamsUrl;
    @JsonProperty("trees_url")
    public String treesUrl;
    @JsonProperty("clone_url")
    public String cloneUrl;
    @JsonProperty("mirror_url")
    public String mirrorUrl;
    @JsonProperty("hooks_url")
    public String hooksUrl;
    @JsonProperty("svn_url")
    public String svnUrl;
    @JsonProperty("homepage")
    public String homepage;
    @JsonProperty("language")
    public Object language;
    @JsonProperty("forks_count")
    public Integer forksCount;
    @JsonProperty("stargazers_count")
    public Integer stargazersCount;
    @JsonProperty("watchers_count")
    public Integer watchersCount;
    @JsonProperty("size")
    public Integer size;
    @JsonProperty("default_branch")
    public String defaultBranch;
    @JsonProperty("open_issues_count")
    public Integer openIssuesCount;
    @JsonProperty("is_template")
    public Boolean isTemplate;
    @JsonProperty("topics")
    public List<String> topics = null;
    @JsonProperty("has_issues")
    public Boolean hasIssues;
    @JsonProperty("has_projects")
    public Boolean hasProjects;
    @JsonProperty("has_wiki")
    public Boolean hasWiki;
    @JsonProperty("has_pages")
    public Boolean hasPages;
    @JsonProperty("has_downloads")
    public Boolean hasDownloads;
    @JsonProperty("archived")
    public Boolean archived;
    @JsonProperty("disabled")
    public Boolean disabled;
    @JsonProperty("visibility")
    public String visibility;
    @JsonProperty("pushed_at")
    public String pushedAt;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("permissions")
    public Permissions permissions;
    @JsonProperty("template_repository")
    public Object templateRepository;
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


}
