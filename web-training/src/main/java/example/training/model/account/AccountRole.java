package example.training.model.account;

public enum AccountRole {
	USER("ユーザー"),
	ADMIN("管理者");

	private String label;

	private AccountRole(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
