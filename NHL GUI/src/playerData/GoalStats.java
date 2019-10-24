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
@JsonPropertyOrder({ "copyright", "stats" })
public class GoalStats {

	@JsonProperty("copyright")
	private String copyright;
	@JsonProperty("stats")
	private List<GoalStat> stats = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("copyright")
	public String getCopyright() {
		return copyright;
	}

	@JsonProperty("copyright")
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	@JsonProperty("stats")
	public List<GoalStat> getStats() {
		return stats;
	}

	@JsonProperty("stats")
	public void setStats(List<GoalStat> stats) {
		this.stats = stats;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	public Integer getGoalsFirstPeriod() {
		return stats.get(0).getSplits().get(0).getStat().getGoalsInFirstPeriod();
	}
	
	public Integer getGoalsSecondPeriod() {
		return stats.get(0).getSplits().get(0).getStat().getGoalsInSecondPeriod();
	}
	
	public Integer getGoalsThirdPeriod() {
		return stats.get(0).getSplits().get(0).getStat().getGoalsInThirdPeriod();
	}
	
	public Integer getGoalsOvertimePeriod() {
		return stats.get(0).getSplits().get(0).getStat().getGoalsInOvertime();
	}
	
	public Integer getEmptyNetGoals() {
		return stats.get(0).getSplits().get(0).getStat().getEmptyNetGoals();
	}
	
	public Integer getGoalsTrailingByOne() {
		return stats.get(0).getSplits().get(0).getStat().getGoalsTrailingByOne();
	}
	
	public Integer getGoalsTrailingByTwo() {
		return stats.get(0).getSplits().get(0).getStat().getGoalsTrailingByTwo();
	}
	
	public Integer getGoalsTrailingByThreePlus() {
		return stats.get(0).getSplits().get(0).getStat().getGoalsTrailingByThreePlus();
	}
	
	public Integer getGoalsLeadingByOne() {
		return stats.get(0).getSplits().get(0).getStat().getGoalsLeadingByOne();
	}
	
	public Integer getGoalsLeadingByTwo() {
		return stats.get(0).getSplits().get(0).getStat().getGoalsLeadingByTwo();
	}
	
	public Integer getGoalsLeadingByThreePlus() {
		return stats.get(0).getSplits().get(0).getStat().getGoalsLeadingByThreePlus();
	}
	
	public Integer getGoalsWhenTied() {
		return stats.get(0).getSplits().get(0).getStat().getGoalsWhenTied();
	}
}
