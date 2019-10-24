package playerData;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "season", "stat" })
public class GoalSplit {

	@JsonProperty("season")
	private String season;
	@JsonProperty("stat")
	private GoalStat_ stat;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("season")
	public String getSeason() {
		return season;
	}

	@JsonProperty("season")
	public void setSeason(String season) {
		this.season = season;
	}

	@JsonProperty("stat")
	public GoalStat_ getStat() {
		return stat;
	}

	@JsonProperty("stat")
	public void setStat(GoalStat_ stat) {
		this.stat = stat;
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
