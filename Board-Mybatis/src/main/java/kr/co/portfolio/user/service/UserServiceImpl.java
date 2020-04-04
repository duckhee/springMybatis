package kr.co.portfolio.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.portfolio.user.dao.UserDao;
import kr.co.portfolio.vo.UserRoleVO;
import kr.co.portfolio.vo.UserVO;

@Service(value="UserService")
public class UserServiceImpl implements UserService{
	
	@Resource(name="UserDao")
	private UserDao dao;

	/**TODO check Logic */
	@Override
	@Transactional
	public boolean signup(UserVO user) {
		// TODO Auto-generated method stub
		UserVO RegisteUser = dao.signup(user);
		if(RegisteUser != null) {
			UserRoleVO role = new UserRoleVO();
			role.setRole("ROLE_USER");
			role.setUser_table_idx(RegisteUser.getIdx());
			if(dao.RoleSignup(role)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public UserVO profile(UserVO user) {
		// TODO Auto-generated method stub
		return dao.profile(user);
	}

}
