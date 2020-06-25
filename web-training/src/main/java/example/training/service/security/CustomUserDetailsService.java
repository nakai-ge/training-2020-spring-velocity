//package example.training.service.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import example.training.model.account.Account;
//import example.training.model.account.AccountRepository;
//import example.training.model.security.UserPrincipal;
//
//public class CustomUserDetailsService implements UserDetailsService {
//
//	@Autowired
//	private AccountRepository securityRepository;
//
//	@Override
//	public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
//		Account account = securityRepository.findByLoginId(loginId);
//		if(account == null)
//			throw new UsernameNotFoundException("user not found");
//		return new UserPrincipal(account);
//	}
//}
