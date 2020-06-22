package example.training.datasource.account;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import example.training.model.account.Account;

@Mapper
public interface AccountMapper {
	Account findByLoginId(@Param("loginId") String loginId);
}
