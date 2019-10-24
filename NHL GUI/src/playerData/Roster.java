package playerData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "roster", "link" })
public class Roster {

	@JsonProperty("roster")
	private List<Roster_> roster = null;
	@JsonProperty("link")
	private String link;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("roster")
	public List<Roster_> getRoster() {
		return roster;
	}

	@JsonProperty("roster")
	public void setRoster(List<Roster_> roster) {
		this.roster = roster;
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
