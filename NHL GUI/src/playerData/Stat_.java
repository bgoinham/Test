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
@JsonPropertyOrder({ "timeOnIce", "assists", "goals", "pim", "shots", "games", "hits", "powerPlayGoals",
		"powerPlayPoints", "powerPlayTimeOnIce", "evenTimeOnIce", "penaltyMinutes", "faceOffPct", "shotPct",
		"gameWinningGoals", "overTimeGoals", "shortHandedGoals", "shortHandedPoints", "shortHandedTimeOnIce", "blocked",
		"plusMinus", "points", "shifts" })
public class Stat_ {

	@JsonProperty("timeOnIce")
	private String timeOnIce;
	@JsonProperty("assists")
	private Integer assists;
	@JsonProperty("goals")
	private Integer goals;
	@JsonProperty("pim")
	private Integer pim;
	@JsonProperty("shots")
	private Integer shots;
	@JsonProperty("games")
	private Integer games;
	@JsonProperty("hits")
	private Integer hits;
	@JsonProperty("powerPlayGoals")
	private Integer powerPlayGoals;
	@JsonProperty("powerPlayPoints")
	private Integer powerPlayPoints;
	@JsonProperty("powerPlayTimeOnIce")
	private String powerPlayTimeOnIce;
	@JsonProperty("evenTimeOnIce")
	private String evenTimeOnIce;
	@JsonProperty("penaltyMinutes")
	private String penaltyMinutes;
	@JsonProperty("faceOffPct")
	private Double faceOffPct;
	@JsonProperty("shotPct")
	private Double shotPct;
	@JsonProperty("gameWinningGoals")
	private Integer gameWinningGoals;
	@JsonProperty("overTimeGoals")
	private Integer overTimeGoals;
	@JsonProperty("shortHandedGoals")
	private Integer shortHandedGoals;
	@JsonProperty("shortHandedPoints")
	private Integer shortHandedPoints;
	@JsonProperty("shortHandedTimeOnIce")
	private String shortHandedTimeOnIce;
	@JsonProperty("blocked")
	private Integer blocked;
	@JsonProperty("plusMinus")
	private Integer plusMinus;
	@JsonProperty("points")
	private Integer points;
	@JsonProperty("shifts")
	private Integer shifts;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("timeOnIce")
	public String getTimeOnIce() {
		return timeOnIce;
	}

	@JsonProperty("timeOnIce")
	public void setTimeOnIce(String timeOnIce) {
		this.timeOnIce = timeOnIce;
	}

	@JsonProperty("assists")
	public Integer getAssists() {
		return assists;
	}

	@JsonProperty("assists")
	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	@JsonProperty("goals")
	public Integer getGoals() {
		return goals;
	}

	@JsonProperty("goals")
	public void setGoals(Integer goals) {
		this.goals = goals;
	}

	@JsonProperty("pim")
	public Integer getPim() {
		return pim;
	}

	@JsonProperty("pim")
	public void setPim(Integer pim) {
		this.pim = pim;
	}

	@JsonProperty("shots")
	public Integer getShots() {
		return shots;
	}

	@JsonProperty("shots")
	public void setShots(Integer shots) {
		this.shots = shots;
	}

	@JsonProperty("games")
	public Integer getGames() {
		return games;
	}

	@JsonProperty("games")
	public void setGames(Integer games) {
		this.games = games;
	}

	@JsonProperty("hits")
	public Integer getHits() {
		return hits;
	}

	@JsonProperty("hits")
	public void setHits(Integer hits) {
		this.hits = hits;
	}

	@JsonProperty("powerPlayGoals")
	public Integer getPowerPlayGoals() {
		return powerPlayGoals;
	}

	@JsonProperty("powerPlayGoals")
	public void setPowerPlayGoals(Integer powerPlayGoals) {
		this.powerPlayGoals = powerPlayGoals;
	}

	@JsonProperty("powerPlayPoints")
	public Integer getPowerPlayPoints() {
		return powerPlayPoints;
	}

	@JsonProperty("powerPlayPoints")
	public void setPowerPlayPoints(Integer powerPlayPoints) {
		this.powerPlayPoints = powerPlayPoints;
	}

	@JsonProperty("powerPlayTimeOnIce")
	public String getPowerPlayTimeOnIce() {
		return powerPlayTimeOnIce;
	}

	@JsonProperty("powerPlayTimeOnIce")
	public void setPowerPlayTimeOnIce(String powerPlayTimeOnIce) {
		this.powerPlayTimeOnIce = powerPlayTimeOnIce;
	}

	@JsonProperty("evenTimeOnIce")
	public String getEvenTimeOnIce() {
		return evenTimeOnIce;
	}

	@JsonProperty("evenTimeOnIce")
	public void setEvenTimeOnIce(String evenTimeOnIce) {
		this.evenTimeOnIce = evenTimeOnIce;
	}

	@JsonProperty("penaltyMinutes")
	public String getPenaltyMinutes() {
		return penaltyMinutes;
	}

	@JsonProperty("penaltyMinutes")
	public void setPenaltyMinutes(String penaltyMinutes) {
		this.penaltyMinutes = penaltyMinutes;
	}

	@JsonProperty("faceOffPct")
	public Double getFaceOffPct() {
		return faceOffPct;
	}

	@JsonProperty("faceOffPct")
	public void setFaceOffPct(Double faceOffPct) {
		this.faceOffPct = faceOffPct;
	}

	@JsonProperty("shotPct")
	public Double getShotPct() {
		return shotPct;
	}

	@JsonProperty("shotPct")
	public void setShotPct(Double shotPct) {
		this.shotPct = shotPct;
	}

	@JsonProperty("gameWinningGoals")
	public Integer getGameWinningGoals() {
		return gameWinningGoals;
	}

	@JsonProperty("gameWinningGoals")
	public void setGameWinningGoals(Integer gameWinningGoals) {
		this.gameWinningGoals = gameWinningGoals;
	}

	@JsonProperty("overTimeGoals")
	public Integer getOverTimeGoals() {
		return overTimeGoals;
	}

	@JsonProperty("overTimeGoals")
	public void setOverTimeGoals(Integer overTimeGoals) {
		this.overTimeGoals = overTimeGoals;
	}

	@JsonProperty("shortHandedGoals")
	public Integer getShortHandedGoals() {
		return shortHandedGoals;
	}

	@JsonProperty("shortHandedGoals")
	public void setShortHandedGoals(Integer shortHandedGoals) {
		this.shortHandedGoals = shortHandedGoals;
	}

	@JsonProperty("shortHandedPoints")
	public Integer getShortHandedPoints() {
		return shortHandedPoints;
	}

	@JsonProperty("shortHandedPoints")
	public void setShortHandedPoints(Integer shortHandedPoints) {
		this.shortHandedPoints = shortHandedPoints;
	}

	@JsonProperty("shortHandedTimeOnIce")
	public String getShortHandedTimeOnIce() {
		return shortHandedTimeOnIce;
	}

	@JsonProperty("shortHandedTimeOnIce")
	public void setShortHandedTimeOnIce(String shortHandedTimeOnIce) {
		this.shortHandedTimeOnIce = shortHandedTimeOnIce;
	}

	@JsonProperty("blocked")
	public Integer getBlocked() {
		return blocked;
	}

	@JsonProperty("blocked")
	public void setBlocked(Integer blocked) {
		this.blocked = blocked;
	}

	@JsonProperty("plusMinus")
	public Integer getPlusMinus() {
		return plusMinus;
	}

	@JsonProperty("plusMinus")
	public void setPlusMinus(Integer plusMinus) {
		this.plusMinus = plusMinus;
	}

	@JsonProperty("points")
	public Integer getPoints() {
		return points;
	}

	@JsonProperty("points")
	public void setPoints(Integer points) {
		this.points = points;
	}

	@JsonProperty("shifts")
	public Integer getShifts() {
		return shifts;
	}

	@JsonProperty("shifts")
	public void setShifts(Integer shifts) {
		this.shifts = shifts;
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
