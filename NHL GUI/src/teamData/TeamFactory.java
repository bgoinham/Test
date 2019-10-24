package teamData;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TeamFactory {
	
	public static Teams getDataFromURL(String urlAsString) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			URL url = new URL(urlAsString);
			return mapper.readValue(url, Teams.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
