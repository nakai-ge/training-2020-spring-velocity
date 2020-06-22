package example.training.model.account;

public class AccountLoginId {
	private String value;

	public AccountLoginId() {
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("AccountLoginId [value=%s]", value);
	}
}
