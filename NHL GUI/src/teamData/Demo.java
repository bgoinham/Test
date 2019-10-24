package teamData;

import jsonStringGenerator.UrlStringModifiers;
import playerData.GameLogFactory;
import playerData.Roster;
import playerData.Stats;

public class Demo {

	public static void main(String[] args) {

		Teams teams = TeamFactory.getDataFromURL("https://statsapi.web.nhl.com/api/v1/teams/?expand=team.roster");
		Team nyi = teams.getTeams().get(4);
		Roster roster = nyi.getRoster();
//		for (int i = 0; i < roster.getRoster().size(); i++) {
//			System.out.print(roster.getRoster().get(i).getPerson().getFullName() + " ");
//			System.out.println(roster.getRoster().get(i).getPerson().getLink());
//		}
		
		System.out.println(roster.getRoster().get(10).getPerson().getFullName());
		String link = roster.getRoster().get(10).getPerson().getLink();

		String nelsonString = UrlStringModifiers.getStatUrlFromLink(link, 2018);

		Stats nelsonStats = GameLogFactory.getStatDataFromURL(nelsonString);

		int zeroShotCounter = 0;
		int oneShotCounter = 0;
		int twoShotCounter = 0;
		int threeShotCounter = 0;
		int fourShotCounter = 0;
		int fivePlusShotCounter = 0;
		for (int i = 0; i < nelsonStats.getStats().get(0).getSplits().size(); i++) {

			if (nelsonStats.getStats().get(0).getSplits().get(i).getStat().getShots() == 0) {
				zeroShotCounter++;
			}
			if (nelsonStats.getStats().get(0).getSplits().get(i).getStat().getShots() == 1) {
				oneShotCounter++;
			}
			if (nelsonStats.getStats().get(0).getSplits().get(i).getStat().getShots() == 2) {
				twoShotCounter++;
			}
			if (nelsonStats.getStats().get(0).getSplits().get(i).getStat().getShots() == 3) {
				threeShotCounter++;
			}
			if (nelsonStats.getStats().get(0).getSplits().get(i).getStat().getShots() == 4) {
				fourShotCounter++;
			}
			if (nelsonStats.getStats().get(0).getSplits().get(i).getStat().getShots() > 4) {
				fivePlusShotCounter++;
			}
			System.out.print(nelsonStats.getStats().get(0).getSplits().get(i).getStat().getShots() + " ");
		}
		System.out.println();
		System.out.println("0 shots: " + zeroShotCounter);
		System.out.println("1 shot: " + oneShotCounter);
		System.out.println("2 shots: " + twoShotCounter);
		System.out.println("3 shots: " + threeShotCounter);
		System.out.println("4 shots: " + fourShotCounter);
		System.out.println("5+ shots: " + fivePlusShotCounter);

//		for (int i = 0; i < rosters.getRoster().size(); i++)
//		System.out.println(rosters.getRoster().get(i));

	}
}
