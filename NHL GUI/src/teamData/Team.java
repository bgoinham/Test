
package teamData;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import playerData.Roster;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties("copyright")
@JsonPropertyOrder({ "id", "name", "link", "venue", "abbreviation", "teamName", "locationName", "firstYearOfPlay",
		"division", "conference", "franchise", "shortName", "officialSiteUrl", "franchiseId", "active" })
public class Team {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("link")
	private String link;
	@JsonProperty("venue")
	private Venue venue;
	@JsonProperty("abbreviation")
	private String abbreviation;
	@JsonProperty("teamName")
	private String teamName;
	@JsonProperty("locationName")
	private String locationName;
	@JsonProperty("firstYearOfPlay")
	private String firstYearOfPlay;
	@JsonProperty("division")
	private Division division;
	@JsonProperty("conference")
	private Conference conference;
	@JsonProperty("franchise")
	private Franchise franchise;
	@JsonProperty("roster")
	private Roster roster;
	@JsonProperty("shortName")
	private String shortName;
	@JsonProperty("officialSiteUrl")
	private String officialSiteUrl;
	@JsonProperty("franchiseId")
	private Integer franchiseId;
	@JsonProperty("active")
	private Boolean active;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("link")
	public String getLink() {
		return link;
	}

	@JsonProperty("link")
	public void setLink(String link) {
		this.link = link;
	}

	@JsonProperty("venue")
	public Venue getVenue() {
		return venue;
	}

	@JsonProperty("venue")
	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	@JsonProperty("abbreviation")
	public String getAbbreviation() {
		return abbreviation;
	}

	@JsonProperty("abbreviation")
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	@JsonProperty("teamName")
	public String getTeamName() {
		return teamName;
	}

	@JsonProperty("teamName")
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@JsonProperty("locationName")
	public String getLocationName() {
		return locationName;
	}

	@JsonProperty("locationName")
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@JsonProperty("firstYearOfPlay")
	public String getFirstYearOfPlay() {
		return firstYearOfPlay;
	}

	@JsonProperty("firstYearOfPlay")
	public void setFirstYearOfPlay(String firstYearOfPlay) {
		this.firstYearOfPlay = firstYearOfPlay;
	}

	@JsonProperty("division")
	public Division getDivision() {
		return division;
	}

	@JsonProperty("division")
	public void setDivision(Division division) {
		this.division = division;
	}

	@JsonProperty("conference")
	public Conference getConference() {
		return conference;
	}

	@JsonProperty("conference")
	public void setConference(Conference conference) {
		this.conference = conference;
	}

	@JsonProperty("franchise")
	public Franchise getFranchise() {
		return franchise;
	}

	@JsonProperty("franchise")
	public void setFranchise(Franchise franchise) {
		this.franchise = franchise;
	}
	
	@JsonProperty("roster")
	public Roster getRoster() {
	return roster;
	}

	@JsonProperty("roster")
	public void setRoster(Roster roster) {
	this.roster = roster;
	}

	@JsonProperty("shortName")
	public String getShortName() {
		return shortName;
	}

	@JsonProperty("shortName")
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@JsonProperty("officialSiteUrl")
	public String getOfficialSiteUrl() {
		return officialSiteUrl;
	}

	@JsonProperty("officialSiteUrl")
	public void setOfficialSiteUrl(String officialSiteUrl) {
		this.officialSiteUrl = officialSiteUrl;
	}

	@JsonProperty("franchiseId")
	public Integer getFranchiseId() {
		return franchiseId;
	}

	@JsonProperty("franchiseId")
	public void setFranchiseId(Integer franchiseId) {
		this.franchiseId = franchiseId;
	}

	@JsonProperty("active")
	public Boolean getActive() {
		return active;
	}

	@JsonProperty("active")
	public void setActive(Boolean active) {
		this.active = active;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", abbreviation=" + abbreviation + ", teamName=" + teamName
				+ ", firstYearOfPlay=" + firstYearOfPlay + "]";
	}
	
	

}
