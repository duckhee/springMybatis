package kr.co.portfolio.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.portfolio.user.dao.UserDao;
import kr.co.portfolio.vo.UserRoleVO;
import kr.co.portfolio.vo.UserVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Service(value="AdminUserService")
public class UserServiceAdminImpl implements UserService{
	
	@Resource(name="AdminUserDao")
	private UserDao dao;

	/**TODO check Logic */
	@Override
	@Transactional
	public boolean signup(UserVO user){
		// TODO Auto-generated method stub
		log.info("Admin Service SignUp");
		/** Insert User */
		UserVO RegisteUser = dao.signup(user);
		log.info("Dao User:" + RegisteUser);
		/** Make User */
		if(RegisteUser != null) {
			log.info("Make Role");
			/** Role Vo */
			UserRoleVO role = new UserRoleVO();
			/** User Role Make  */
			role.setRole("ROLE_ADMIN");
			/** User Idx */
			role.setUser_table_idx(RegisteUser.getIdx());
			//role.setUser_table_idx(340L);
			if(dao.RoleSignup(role)) {
				log.info("done");
				return true;
			}
		}
		/** Failed */
		return false;
		//return dao.signup(user);
	}

	@Override
	public UserVO profile(UserVO user) {
		// TODO Auto-generated method stub
		log.info("Admin Service Profile");
		return dao.profile(user);
	}

}
