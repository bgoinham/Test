package jsonStringGenerator;

public class UrlStringModifiers {
	private static String baseURL = "https://statsapi.web.nhl.com";
	private static String statURL = "/stats?stats=gameLog&season=";
	private static String goalURL =  "/stats?stats=goalsByGameSituation&season=";

	public static String getStatUrlFromLink(String link, Integer year) {
		Integer nextYear = year + 1;

		String yearURL = year.toString() + nextYear.toString();

		String finalURL = baseURL + link + statURL + yearURL;

		return finalURL;
	}
	
	public static String getGoalStatUrlFromLink(String link, Integer year) {
		Integer nextYear = year + 1;
		
		String yearURL = year.toString() + nextYear.toString();
		
		String finalURL = baseURL + link + goalURL + yearURL;
		
		return finalURL;
	}

}
