package example.training.model.account;

public class AccountId {
	private Integer value;

	public AccountId() {
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("AccountId [value=%s]", value);
	}
}
