package kr.co.portfolio.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.portfolio.vo.Criteria;
import kr.co.portfolio.vo.UserVO;

@Repository(value="AdminMemberDao")
public class MemberDaoAdminImpl implements MemberDao{
	
	@Autowired
	private SqlSession session;

	@Override
	public boolean create(UserVO user) {
		// TODO Auto-generated method stub
		return session.insert("registeMember", user) == 1;
	}

	@Override
	public boolean modify(UserVO user) {
		// TODO Auto-generated method stub
		return session.update("modifyMember", user) == 1;
	}

	@Override
	public List<UserVO> paging(Criteria cri) {
		// TODO Auto-generated method stub
		return session.selectList("pagingMember", cri);
	}

	@Override
	public UserVO detail(UserVO user) {
		// TODO Auto-generated method stub
		return session.selectOne("detailMember", user);
	}

	@Override
	public int count(Criteria cri) {
		// TODO Auto-generated method stub
		return session.selectOne("countMember", cri);
	}

	@Override
	public boolean delete(UserVO user) {
		// TODO Auto-generated method stub
		return session.delete("deleteMember", user) == 1;
	}

}
