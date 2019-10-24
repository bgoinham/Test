package jsonStringGenerator;

import java.util.ArrayList;
import java.util.HashMap;

import playerData.Person;
import teamData.Team;
import teamData.TeamFactory;
import teamData.Teams;

public class Finder {
	private static final String url = "https://statsapi.web.nhl.com/api/v1/teams/?expand=team.roster";
	private Teams teams = TeamFactory.getDataFromURL(url);
	private Team[] nhlTeams = new Team[31];

	public Finder() {
		for (int i = 0; i < teams.getTeams().size(); i++) {
			nhlTeams[i] = teams.getTeams().get(i);
		}
	}

	public ArrayList<String> createIsles() {
		ArrayList<String> roster = new ArrayList<String>(nhlTeams[1].getRoster().getRoster().size());
		for (int i = 0; i < nhlTeams[1].getRoster().getRoster().size(); i++) {
			roster.add(nhlTeams[1].getRoster().getRoster().get(i).getPerson().getFullName());
		}
		return roster;
	}

	public ArrayList<String> createSkaterRoster() {
		ArrayList<String> leagueRoster = new ArrayList<String>(1000);
		// cycles through teams
		for (int i = 0; i < nhlTeams.length; i++) {
			// cycles through rosters
			for (int j = 0; j < nhlTeams[i].getRoster().getRoster().size(); j++) {
				if (nhlTeams[i].getRoster().getRoster().get(j).getPosition().getCode().equalsIgnoreCase("g")) {

				} else {
					leagueRoster.add(nhlTeams[i].getRoster().getRoster().get(j).getPerson().getFullName());
				}

			}
		}
		return leagueRoster;
	}

	public HashMap<Integer, String> createLeagueRoster() {
		HashMap<Integer, String> leagueRoster = new HashMap<Integer, String>(1000);
		// cycles through teams
		for (int i = 0; i < nhlTeams.length; i++) {
			// cycles through rosters
			for (int j = 0; j < nhlTeams[i].getRoster().getRoster().size(); j++) {
				leagueRoster.put(nhlTeams[i].getRoster().getRoster().get(j).getPerson().getId(),
						nhlTeams[i].getRoster().getRoster().get(j).getPerson().getFullName());
			}
		}
		return leagueRoster;
	}

	public ArrayList<String> findPlayersContaining(String substring) {
		if (substring.length() < 3) {
			return null;
		} else {
			ArrayList<String> nameList = new ArrayList<String>();
			// cycles through teams
			for (int i = 0; i < nhlTeams.length; i++) {
				// cycles through rosters
				for (int j = 0; j < nhlTeams[i].getRoster().getRoster().size(); j++) {
					if (nhlTeams[i].getRoster().getRoster().get(j).getPerson().getFullName().toLowerCase()
							.contains(substring.toLowerCase())) {
						nameList.add(nhlTeams[i].getRoster().getRoster().get(j).getPerson().getFullName());
					}
				}

			}
			return nameList;
		}
	}

	public Person findPlayer(String fullName) {
		// cycles through teams
		for (int i = 0; i < nhlTeams.length; i++) {
			// cycles through roster of i'th team
			for (int j = 0; j < nhlTeams[i].getRoster().getRoster().size(); j++) {
				if (fullName.equalsIgnoreCase(nhlTeams[i].getRoster().getRoster().get(j).getPerson().getFullName())) {

					return nhlTeams[i].getRoster().getRoster().get(j).getPerson();
				}
			}
		}
		return null;

	}

	public Teams getTeams() {
		return teams;
	}

	public void setTeams(Teams teams) {
		this.teams = teams;
	}

	public static String getUrl() {
		return url;
	}

}
