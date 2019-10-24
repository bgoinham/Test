package playerData;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import teamData.Team;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "season", "stat", "team", "opponent", "date", "isHome", "isWin", "isOT", "game" })
public class Split {

	@JsonProperty("season")
	private String season;
	@JsonProperty("stat")
	private Stat_ stat;
	@JsonProperty("team")
	private Team team;
	@JsonProperty("opponent")
	private Opponent opponent;
	@JsonProperty("date")
	private String date;
	@JsonProperty("isHome")
	private Boolean isHome;
	@JsonProperty("isWin")
	private Boolean isWin;
	@JsonProperty("isOT")
	private Boolean isOT;
	@JsonProperty("game")
	private Game game;
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
	public Stat_ getStat() {
		return stat;
	}

	@JsonProperty("stat")
	public void setStat(Stat_ stat) {
		this.stat = stat;
	}

	@JsonProperty("team")
	public Team getTeam() {
		return team;
	}

	@JsonProperty("team")
	public void setTeam(Team team) {
		this.team = team;
	}

	@JsonProperty("opponent")
	public Opponent getOpponent() {
		return opponent;
	}

	@JsonProperty("opponent")
	public void setOpponent(Opponent opponent) {
		this.opponent = opponent;
	}

	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("isHome")
	public Boolean getIsHome() {
		return isHome;
	}

	@JsonProperty("isHome")
	public void setIsHome(Boolean isHome) {
		this.isHome = isHome;
	}

	@JsonProperty("isWin")
	public Boolean getIsWin() {
		return isWin;
	}

	@JsonProperty("isWin")
	public void setIsWin(Boolean isWin) {
		this.isWin = isWin;
	}

	@JsonProperty("isOT")
	public Boolean getIsOT() {
		return isOT;
	}

	@JsonProperty("isOT")
	public void setIsOT(Boolean isOT) {
		this.isOT = isOT;
	}

	@JsonProperty("game")
	public Game getGame() {
		return game;
	}

	@JsonProperty("game")
	public void setGame(Game game) {
		this.game = game;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	public String getSeasonOneYear() {
		return season.substring(0, 3);
	}

}
