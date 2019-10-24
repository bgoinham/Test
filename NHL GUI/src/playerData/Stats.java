package playerData;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
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
public class Stats {

	@JsonProperty("copyright")
	private String copyright;
	@JsonProperty("stats")
	private List<Stat> stats = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	@JsonIgnore
	private Iterator<Object> statIterator;

	@JsonProperty("copyright")
	public String getCopyright() {
		return copyright;
	}

	@JsonProperty("copyright")
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	@JsonProperty("stats")
	public List<Stat> getStats() {
		return stats;
	}

	@JsonProperty("stats")
	public void setStats(List<Stat> stats) {
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

	public int getPointSingleGame(int gameIndex) {
		return stats.get(0).getSplits().get(gameIndex).getStat().getPoints();
	}

	public int getTotalPointsForSeason() {
		int totalPoints = 0;
		for (int i = 0; i < stats.get(0).getSplits().size(); i++) {
			totalPoints += getPointSingleGame(i);
		}
		return totalPoints;
	}

	public int getGamesPlayed() {
		return stats.get(0).getSplits().size();
	}

	public String getPointsPerGame() {
		Integer totalPoints = getTotalPointsForSeason();
		Integer gamesPlayed = getGamesPlayed();
		double pointsPerGame = totalPoints.doubleValue() / gamesPlayed.doubleValue();
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(pointsPerGame);
	}

	public Integer getGoals() {
		int goalTotal = 0;
		for (int i = 0; i < getGamesPlayed(); i++) {

			goalTotal += stats.get(0).getSplits().get(i).getStat().getGoals();
		}
		return goalTotal;
	}

	public Integer getAssists() {
		int assistTotal = 0;
		for (int i = 0; i < getGamesPlayed(); i++) {

			assistTotal += stats.get(0).getSplits().get(i).getStat().getAssists();
		}
		return assistTotal;
	}

	public Integer getPoints() {
		int goalTotal = 0;
		for (int i = 0; i < getGamesPlayed(); i++) {

			goalTotal += stats.get(0).getSplits().get(i).getStat().getPoints();
		}
		return goalTotal;
	}

	public String getToi() {
		int goalTotal = 0;
		for (int i = 0; i < getGamesPlayed(); i++) {

//			goalTotal += stats.get(0).getSplits().get(i).getStat().getTimeOnIce();
		}
		return "N/A";
	}

	public Integer getShots() {
		int goalTotal = 0;
		for (int i = 0; i < getGamesPlayed(); i++) {

			goalTotal += stats.get(0).getSplits().get(i).getStat().getShots();
		}
		return goalTotal;
	}

	public Integer getHits() {
		int goalTotal = 0;
		for (int i = 0; i < getGamesPlayed(); i++) {

			goalTotal += stats.get(0).getSplits().get(i).getStat().getHits();
		}
		return goalTotal;
	}

	public Integer getPowerPlayGoals() {
		int goalTotal = 0;
		for (int i = 0; i < getGamesPlayed(); i++) {

			goalTotal += stats.get(0).getSplits().get(i).getStat().getPowerPlayGoals();
		}
		return goalTotal;
	}

	public Integer getShortHandedGoals() {
		int goalTotal = 0;
		for (int i = 0; i < getGamesPlayed(); i++) {

			goalTotal += stats.get(0).getSplits().get(i).getStat().getShortHandedGoals();
		}
		return goalTotal;
	}

	public Integer getGameWinningGoals() {
		int goalTotal = 0;
		for (int i = 0; i < getGamesPlayed(); i++) {

			goalTotal += stats.get(0).getSplits().get(i).getStat().getGameWinningGoals();
		}
		return goalTotal;
	}

	public Integer getPlusMinus() {
		int goalTotal = 0;
		for (int i = 0; i < getGamesPlayed(); i++) {

			goalTotal += stats.get(0).getSplits().get(i).getStat().getPlusMinus();
		}
		return goalTotal;
	}

	public Integer getBlocked() {
		int goalTotal = 0;
		for (int i = 0; i < getGamesPlayed(); i++) {

			goalTotal += stats.get(0).getSplits().get(i).getStat().getBlocked();
		}
		return goalTotal;
	}

	public String getShotPct() {
//		Double goalTotal = 0.0;
//		for (int i = 0; i < getGamesPlayed(); i++) {
//
//			goalTotal += stats.get(0).getSplits().get(i).getStat().getShotPct();
//		}
//		return goalTotal;
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format((double) ((double) getGoals() / (double) getShots()) * 100);
	}

}
