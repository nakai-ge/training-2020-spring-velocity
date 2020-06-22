package example.training.model.account;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = -2900730869601280224L;

	private AccountId id;
	private AccountLoginId loginId;
	private AccountName name;
	private AccountRole role;
	private Password password;

	public Account() {
		this.id = new AccountId();
		this.loginId = new AccountLoginId();
		this.name = new AccountName();
		this.role = AccountRole.USER;
		this.password = new Password();
	}

	public AccountId getId() {
		return id;
	}

	public AccountLoginId getLoginId() {
		return loginId;
	}

	public AccountName getName() {
		return name;
	}

	public AccountRole getRole() {
		return role;
	}

	public Password getPassword() {
		return password;
	}

	public void setId(AccountId id) {
		this.id = id;
	}

	public void setLoginId(AccountLoginId loginId) {
		this.loginId = loginId;
	}

	public void setName(AccountName name) {
		this.name = name;
	}

	public void setRole(AccountRole role) {
		this.role = role;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("Account [id=%s, loginId=%s, name=%s, role=%s, password=%s]", id, loginId, name, role,
				password);
	}

}
