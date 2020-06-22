package example.training.model.account;

public class AccountName {
	private String value;

	public AccountName() {
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
		return String.format("AccountName [value=%s]", value);
	}
}
