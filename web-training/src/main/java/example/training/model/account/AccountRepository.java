package example.training.model.account;

public interface AccountRepository {
	public Account findByLoginId(String loginId);
}
