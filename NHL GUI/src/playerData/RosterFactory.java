package playerData;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RosterFactory {

	public static Roster getDataFromURL(String urlAsString) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			URL url = new URL(urlAsString);
			return mapper.readValue(url, Roster.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
