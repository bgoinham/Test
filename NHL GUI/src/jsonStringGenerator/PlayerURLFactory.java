package jsonStringGenerator;

import playerData.Roster;
import teamData.Team;
import teamData.TeamFactory;
import teamData.Teams;

public class PlayerURLFactory {

	public static String generatePlayerURL(String name) {
		Teams teams = TeamFactory.getDataFromURL("https://statsapi.web.nhl.com/api/v1/teams/?expand=team.roster");
		Team nyi = teams.getTeams().get(1);
		Roster roster = nyi.getRoster();
		String url = null;
		for (int i = 0; i < roster.getRoster().size(); i++) {
			if (name.compareToIgnoreCase(roster.getRoster().get(i).getPerson().getFullName()) == 0) {
				url = roster.getRoster().get(i).getPerson().getLink();
			} else {
				
			}

		}
		return url;

	}

}
