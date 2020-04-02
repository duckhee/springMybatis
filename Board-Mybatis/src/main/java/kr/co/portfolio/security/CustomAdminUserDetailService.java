package kr.co.portfolio.security;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import kr.co.portfolio.user.dao.UserDao;
import kr.co.portfolio.vo.UserVO;

public class CustomAdminUserDetailService implements UserDetailsService{
	
	@Resource(name="AdminUserDao")
	private UserDao dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserVO user = dao.login(username);
		//return null;
		return user == null ? null : new CustomUser(user);
	}

}
