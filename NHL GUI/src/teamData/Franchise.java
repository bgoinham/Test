
package teamData;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "franchiseId", "teamName", "link" })
public class Franchise {

	@JsonProperty("franchiseId")
	private Integer franchiseId;
	@JsonProperty("teamName")
	private String teamName;
	@JsonProperty("link")
	private String link;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("franchiseId")
	public Integer getFranchiseId() {
		return franchiseId;
	}

	@JsonProperty("franchiseId")
	public void setFranchiseId(Integer franchiseId) {
		this.franchiseId = franchiseId;
	}

	@JsonProperty("teamName")
	public String getTeamName() {
		return teamName;
	}

	@JsonProperty("teamName")
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@JsonProperty("link")
	public String getLink() {
		return link;
	}

	@JsonProperty("link")
	public void setLink(String link) {
		this.link = link;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
