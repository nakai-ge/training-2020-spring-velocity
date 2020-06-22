package example.training.model.account;

public class Password {
	private String value;

	public Password() {
		this.value = "";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("Password [value=%s]", value);
	}
}
