package kr.co.portfolio.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.portfolio.vo.BoardReplyVO;
import kr.co.portfolio.vo.BoardVO;
import kr.co.portfolio.vo.Criteria;

@Repository(value="BoardDao")
public class BoardDaoImpl implements BoardDao{

	@Override
	public boolean create(BoardVO board) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BoardVO view(Long board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(BoardVO board) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(List<Long> board, int count) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int count(Criteria cri) {
		// TODO Auto-generated method stub
		return 0;
	}
 
	
	@Override
	public List<BoardVO> paging(Criteria cri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createReply(BoardReplyVO reply) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BoardReplyVO viewReply(BoardReplyVO reply) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardReplyVO> listReply(BoardReplyVO reply) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyReply(BoardReplyVO reply) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteReply(BoardReplyVO reply) {
		// TODO Auto-generated method stub
		return false;
	}

}
