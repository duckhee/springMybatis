package kr.co.portfolio.member.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.portfolio.vo.Criteria;
import kr.co.portfolio.vo.UserVO;

@Repository(value="MemberDao")
public class MemberDaoImpl implements MemberDao{

	@Override
	public boolean create(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modify(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserVO> paging(Criteria cri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO detail(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(Criteria cri) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}

}
