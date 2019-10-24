package playerData;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "gamePk", "link", "content" })
public class Game {

	@JsonProperty("gamePk")
	private Integer gamePk;
	@JsonProperty("link")
	private String link;
	@JsonProperty("content")
	private Content content;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("gamePk")
	public Integer getGamePk() {
		return gamePk;
	}

	@JsonProperty("gamePk")
	public void setGamePk(Integer gamePk) {
		this.gamePk = gamePk;
	}

	@JsonProperty("link")
	public String getLink() {
		return link;
	}

	@JsonProperty("link")
	public void setLink(String link) {
		this.link = link;
	}

	@JsonProperty("content")
	public Content getContent() {
		return content;
	}

	@JsonProperty("content")
	public void setContent(Content content) {
		this.content = content;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
