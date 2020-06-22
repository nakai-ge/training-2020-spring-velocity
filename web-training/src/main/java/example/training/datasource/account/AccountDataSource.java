package example.training.datasource.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import example.training.model.account.Account;
import example.training.model.account.AccountRepository;

@Repository
public class AccountDataSource implements AccountRepository{

	@Autowired
	private AccountMapper mapper;

	@Override
	public Account findByLoginId(String loginId) {
		return mapper.findByLoginId(loginId);
	}

}
