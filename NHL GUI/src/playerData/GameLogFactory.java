package playerData;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GameLogFactory {
	
	public static Stats getStatDataFromURL(String urlAsString) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			URL url = new URL(urlAsString);
			return mapper.readValue(url, Stats.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static GoalStats getGoalStatDataFromURL(String urlAsString) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			URL url = new URL(urlAsString);
			return mapper.readValue(url, GoalStats.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
