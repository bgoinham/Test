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
@JsonPropertyOrder({ "type", "splits" })
public class GoalStat {

	@JsonProperty("type")
	private Type type;
	@JsonProperty("splits")
	private List<GoalSplit> splits = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("type")
	public Type getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(Type type) {
		this.type = type;
	}

	@JsonProperty("splits")
	public List<GoalSplit> getSplits() {
		return splits;
	}

	@JsonProperty("splits")
	public void setSplits(List<GoalSplit> splits) {
		this.splits = splits;
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
