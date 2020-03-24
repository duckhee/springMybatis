package kr.co.portfolio.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.portfolio.vo.UserVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Repository(value="AdminUserDao")
public class UserDaoAdminImpl implements UserDao{
	
	@Autowired
	private SqlSession session;

	@Override
	public boolean create(UserVO user) {
		// TODO Auto-generated method stub
		log.info("Create User");
		//return false;
		return session.insert("craeteUser", user) == 1;
	}

	@Override
	public List<UserVO> list() {
		// TODO Auto-generated method stub
		log.info("List User");
		return session.selectList("userList");
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
	public UserVO find(UserVO user) {
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



}
