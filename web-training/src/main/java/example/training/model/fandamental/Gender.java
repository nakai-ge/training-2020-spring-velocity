package example.training.model.fandamental;

import java.util.LinkedHashMap;
import java.util.Map;

public enum Gender{
	MALE("男性"),
	FEMALE("女性");

	private String label;

	private Gender(String label) {
		this.label = label;
	}

	public Map<String, String> options() {
		Map<String, String> options = new LinkedHashMap<String, String>();
		for( Gender gender : Gender.values())
			options.put(gender.name(), gender.getLabel());
		return options;
	}

	public String getLabel() {
		return label;
	}
}
