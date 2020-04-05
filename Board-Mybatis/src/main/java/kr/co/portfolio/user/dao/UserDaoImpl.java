package kr.co.portfolio.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.portfolio.vo.Criteria;
import kr.co.portfolio.vo.UserRoleVO;
import kr.co.portfolio.vo.UserVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Repository(value="UserDao")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SqlSession session;

	@Override
	public UserVO signup(UserVO user) {
		// TODO Auto-generated method stub
		session.insert("signupUser", user);
		log.info("user idx:" + user.getIdx());
		if(user.getIdx() == null) {
			return null;
		}
		return user;
	}

	@Override
	public List<UserVO> paging(Criteria cri) {
		// TODO Auto-generated method stub
		log.info("List User");
		return null;
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		log.info("Check User");
		return false;
	}

	@Override
	public boolean delete(UserVO user) {
		// TODO Auto-generated method stub
		log.info("Delete User");
		return false;
	}

	@Override
	public UserVO profile(UserVO user) {
		// TODO Auto-generated method stub
		log.info("Find User");
		return null;
	}

	@Override
	public boolean update(UserVO user) {
		// TODO Auto-generated method stub
		log.info("Update User");
		return false;
	}

	@Override
	public int count(Criteria cri) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserVO login(String email) {
		// TODO Auto-generated method stub
		return session.selectOne("loginUser", email);
	}

	@Override
	public boolean RoleSignup(UserRoleVO role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RoleModify(UserRoleVO role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RoleDelete(UserRoleVO role) {
		// TODO Auto-generated method stub
		return false;
	}

}
