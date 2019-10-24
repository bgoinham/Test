package jsonStringGenerator;

import playerData.GameLogFactory;
import playerData.GoalStats;
import playerData.Stats;
import teamData.TeamFactory;
import teamData.Teams;

public class Demo2 {

	public static void main(String[] args) {

		Finder finder = new Finder();

		String link = finder.findPlayer("alex ovechkin").getLink();
		Teams teams = TeamFactory.getDataFromURL("https://statsapi.web.nhl.com/api/v1/teams/?expand=team.roster");

		Stats stats = GameLogFactory.getStatDataFromURL(UrlStringModifiers.getStatUrlFromLink(link, 2014));

//		int year = 1991;
//		while(GameLogFactory.getStatDataFromURL(UrlStringModifiers.getStatUrlFromLink(link, year)).getGamesPlayed() == 0 && ) {
//			year++;
//			System.out.println("not done");
//		}
//		
//			System.out.println("done");
//		
		System.out.println();
		GoalStats goalStats = GameLogFactory
				.getGoalStatDataFromURL(UrlStringModifiers.getGoalStatUrlFromLink(link, 2014));
//		System.out.println(goalStats.getStats().get(0).getSplits().get(0).getStat().getGoalsInFirstPeriod());
//		System.out.println(goalStats.getStats().get(0).getSplits().get(0).getStat().getGoalsLeadingByOne());

//		System.out.println(stats.getPointsPerGame());
//		System.out.println(stats.getTotalPointsForSeason());
//		System.out.println(stats.getGamesPlayed());
//		System.out.println(finder.findPlayer("brock nelson").getId());

		System.out.println(goalStats.getGoalsFirstPeriod());
		System.out.println(goalStats.getGoalsSecondPeriod());
		System.out.println(goalStats.getGoalsThirdPeriod());
		System.out.println(goalStats.getGoalsOvertimePeriod());
		System.out.println(stats.getGoals());

		System.out.println(UrlStringModifiers.getStatUrlFromLink(link, 1980));

	}

}
