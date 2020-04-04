package kr.co.portfolio.user.dao;

import java.util.List;

import kr.co.portfolio.vo.Criteria;
import kr.co.portfolio.vo.UserRoleVO;
import kr.co.portfolio.vo.UserVO;

public interface UserDao {

	/** Create User */
	public UserVO signup(UserVO user);
	/** List User */
	public List<UserVO> paging(Criteria cri);
	/** Check Email */
	public boolean checkEmail(String email);
	/** delete User */
	public boolean delete(UserVO user);
	/** find User */
	public UserVO profile(UserVO user);
	/** modify user */
	public boolean update(UserVO user);
	/** count User */
	public int count(Criteria cri);
	/** Login User */
	public UserVO login(String email);
	
	/** Create User Role */
	public boolean RoleSignup(UserRoleVO role);
	/** Modify User Role */
	public boolean RoleModify(UserRoleVO role);
	/** Delete User Role */
	public boolean RoleDelete(UserRoleVO role);
	
}
