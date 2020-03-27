package kr.co.portfolio.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.portfolio.user.dao.UserDao;
import kr.co.portfolio.vo.UserVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Service(value="AdminUserService")
public class UserServiceAdminImpl implements UserService{
	
	@Resource(name="AdminUserDao")
	private UserDao dao;

	@Override
	public boolean signup(UserVO user) {
		// TODO Auto-generated method stub
		log.info("Admin Service SignUp");
		return dao.signup(user);
	}

	@Override
	public UserVO profile(UserVO user) {
		// TODO Auto-generated method stub
		log.info("Admin Service Profile");
		return dao.profile(user);
	}

}
