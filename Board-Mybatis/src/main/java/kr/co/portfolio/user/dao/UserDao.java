package kr.co.portfolio.user.dao;

import java.util.List;

import kr.co.portfolio.vo.UserVO;

public interface UserDao {

	/** Create User */
	public boolean create(UserVO user);
	/** List User */
	public List<UserVO> list();
	/** Check Email */
	public boolean checkEmail(String email);
	/** delete User */
	public boolean delete(UserVO user);
	/** find User */
	public UserVO find(UserVO user);
	/** modify user */
	public boolean update(UserVO user);
	
}
