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
@JsonPropertyOrder({ "person", "jerseyNumber", "position" })
public class Roster_ {

	@JsonProperty("person")
	private Person person;
	@JsonProperty("jerseyNumber")
	private String jerseyNumber;
	@JsonProperty("position")
	private Position position;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("person")
	public Person getPerson() {
		return person;
	}

	@JsonProperty("person")
	public void setPerson(Person person) {
		this.person = person;
	}

	@JsonProperty("jerseyNumber")
	public String getJerseyNumber() {
		return jerseyNumber;
	}

	@JsonProperty("jerseyNumber")
	public void setJerseyNumber(String jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	@JsonProperty("position")
	public Position getPosition() {
		return position;
	}

	@JsonProperty("position")
	public void setPosition(Position position) {
		this.position = position;
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