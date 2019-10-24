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
@JsonPropertyOrder({ "goalsInFirstPeriod", "goalsInSecondPeriod", "goalsInThirdPeriod", "goalsInOvertime",
		"gameWinningGoals", "emptyNetGoals", "shootOutGoals", "shootOutShots", "goalsTrailingByOne",
		"goalsTrailingByTwo", "goalsTrailingByThreePlus", "goalsWhenTied", "goalsLeadingByOne", "goalsLeadingByTwo",
		"goalsLeadingByThreePlus", "penaltyGoals", "penaltyShots" })
public class GoalStat_ {

	@JsonProperty("goalsInFirstPeriod")
	private Integer goalsInFirstPeriod;
	@JsonProperty("goalsInSecondPeriod")
	private Integer goalsInSecondPeriod;
	@JsonProperty("goalsInThirdPeriod")
	private Integer goalsInThirdPeriod;
	@JsonProperty("goalsInOvertime")
	private Integer goalsInOvertime;
	@JsonProperty("gameWinningGoals")
	private Integer gameWinningGoals;
	@JsonProperty("emptyNetGoals")
	private Integer emptyNetGoals;
	@JsonProperty("shootOutGoals")
	private Integer shootOutGoals;
	@JsonProperty("shootOutShots")
	private Integer shootOutShots;
	@JsonProperty("goalsTrailingByOne")
	private Integer goalsTrailingByOne;
	@JsonProperty("goalsTrailingByTwo")
	private Integer goalsTrailingByTwo;
	@JsonProperty("goalsTrailingByThreePlus")
	private Integer goalsTrailingByThreePlus;
	@JsonProperty("goalsWhenTied")
	private Integer goalsWhenTied;
	@JsonProperty("goalsLeadingByOne")
	private Integer goalsLeadingByOne;
	@JsonProperty("goalsLeadingByTwo")
	private Integer goalsLeadingByTwo;
	@JsonProperty("goalsLeadingByThreePlus")
	private Integer goalsLeadingByThreePlus;
	@JsonProperty("penaltyGoals")
	private Integer penaltyGoals;
	@JsonProperty("penaltyShots")
	private Integer penaltyShots;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("goalsInFirstPeriod")
	public Integer getGoalsInFirstPeriod() {
		return goalsInFirstPeriod;
	}

	@JsonProperty("goalsInFirstPeriod")
	public void setGoalsInFirstPeriod(Integer goalsInFirstPeriod) {
		this.goalsInFirstPeriod = goalsInFirstPeriod;
	}

	@JsonProperty("goalsInSecondPeriod")
	public Integer getGoalsInSecondPeriod() {
		return goalsInSecondPeriod;
	}

	@JsonProperty("goalsInSecondPeriod")
	public void setGoalsInSecondPeriod(Integer goalsInSecondPeriod) {
		this.goalsInSecondPeriod = goalsInSecondPeriod;
	}

	@JsonProperty("goalsInThirdPeriod")
	public Integer getGoalsInThirdPeriod() {
		return goalsInThirdPeriod;
	}

	@JsonProperty("goalsInThirdPeriod")
	public void setGoalsInThirdPeriod(Integer goalsInThirdPeriod) {
		this.goalsInThirdPeriod = goalsInThirdPeriod;
	}

	@JsonProperty("goalsInOvertime")
	public Integer getGoalsInOvertime() {
		return goalsInOvertime;
	}

	@JsonProperty("goalsInOvertime")
	public void setGoalsInOvertime(Integer goalsInOvertime) {
		this.goalsInOvertime = goalsInOvertime;
	}

	@JsonProperty("gameWinningGoals")
	public Integer getGameWinningGoals() {
		return gameWinningGoals;
	}

	@JsonProperty("gameWinningGoals")
	public void setGameWinningGoals(Integer gameWinningGoals) {
		this.gameWinningGoals = gameWinningGoals;
	}

	@JsonProperty("emptyNetGoals")
	public Integer getEmptyNetGoals() {
		return emptyNetGoals;
	}

	@JsonProperty("emptyNetGoals")
	public void setEmptyNetGoals(Integer emptyNetGoals) {
		this.emptyNetGoals = emptyNetGoals;
	}

	@JsonProperty("shootOutGoals")
	public Integer getShootOutGoals() {
		return shootOutGoals;
	}

	@JsonProperty("shootOutGoals")
	public void setShootOutGoals(Integer shootOutGoals) {
		this.shootOutGoals = shootOutGoals;
	}

	@JsonProperty("shootOutShots")
	public Integer getShootOutShots() {
		return shootOutShots;
	}

	@JsonProperty("shootOutShots")
	public void setShootOutShots(Integer shootOutShots) {
		this.shootOutShots = shootOutShots;
	}

	@JsonProperty("goalsTrailingByOne")
	public Integer getGoalsTrailingByOne() {
		return goalsTrailingByOne;
	}

	@JsonProperty("goalsTrailingByOne")
	public void setGoalsTrailingByOne(Integer goalsTrailingByOne) {
		this.goalsTrailingByOne = goalsTrailingByOne;
	}

	@JsonProperty("goalsTrailingByTwo")
	public Integer getGoalsTrailingByTwo() {
		return goalsTrailingByTwo;
	}

	@JsonProperty("goalsTrailingByTwo")
	public void setGoalsTrailingByTwo(Integer goalsTrailingByTwo) {
		this.goalsTrailingByTwo = goalsTrailingByTwo;
	}

	@JsonProperty("goalsTrailingByThreePlus")
	public Integer getGoalsTrailingByThreePlus() {
		return goalsTrailingByThreePlus;
	}

	@JsonProperty("goalsTrailingByThreePlus")
	public void setGoalsTrailingByThreePlus(Integer goalsTrailingByThreePlus) {
		this.goalsTrailingByThreePlus = goalsTrailingByThreePlus;
	}

	@JsonProperty("goalsWhenTied")
	public Integer getGoalsWhenTied() {
		return goalsWhenTied;
	}

	@JsonProperty("goalsWhenTied")
	public void setGoalsWhenTied(Integer goalsWhenTied) {
		this.goalsWhenTied = goalsWhenTied;
	}

	@JsonProperty("goalsLeadingByOne")
	public Integer getGoalsLeadingByOne() {
		return goalsLeadingByOne;
	}

	@JsonProperty("goalsLeadingByOne")
	public void setGoalsLeadingByOne(Integer goalsLeadingByOne) {
		this.goalsLeadingByOne = goalsLeadingByOne;
	}

	@JsonProperty("goalsLeadingByTwo")
	public Integer getGoalsLeadingByTwo() {
		return goalsLeadingByTwo;
	}

	@JsonProperty("goalsLeadingByTwo")
	public void setGoalsLeadingByTwo(Integer goalsLeadingByTwo) {
		this.goalsLeadingByTwo = goalsLeadingByTwo;
	}

	@JsonProperty("goalsLeadingByThreePlus")
	public Integer getGoalsLeadingByThreePlus() {
		return goalsLeadingByThreePlus;
	}

	@JsonProperty("goalsLeadingByThreePlus")
	public void setGoalsLeadingByThreePlus(Integer goalsLeadingByThreePlus) {
		this.goalsLeadingByThreePlus = goalsLeadingByThreePlus;
	}

	@JsonProperty("penaltyGoals")
	public Integer getPenaltyGoals() {
		return penaltyGoals;
	}

	@JsonProperty("penaltyGoals")
	public void setPenaltyGoals(Integer penaltyGoals) {
		this.penaltyGoals = penaltyGoals;
	}

	@JsonProperty("penaltyShots")
	public Integer getPenaltyShots() {
		return penaltyShots;
	}

	@JsonProperty("penaltyShots")
	public void setPenaltyShots(Integer penaltyShots) {
		this.penaltyShots = penaltyShots;
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
