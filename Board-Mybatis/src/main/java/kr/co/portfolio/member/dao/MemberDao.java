package kr.co.portfolio.member.dao;

import java.util.List;

import kr.co.portfolio.vo.Criteria;
import kr.co.portfolio.vo.UserVO;

public interface MemberDao {

	/** Registe Member */
	public boolean create(UserVO user);
	/** Modify Member */
	public boolean modify(UserVO user);
	/** List Member */
	public List<UserVO> paging(Criteria cri);
	/** Detail Member */
	public UserVO detail(UserVO user);
	/** Get Total Member */
	public int count(Criteria cri);
	/** Delete Member */
	public boolean delete(UserVO user);
}
