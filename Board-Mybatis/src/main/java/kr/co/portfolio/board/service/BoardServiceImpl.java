package kr.co.portfolio.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.portfolio.board.dao.BoardDao;
import kr.co.portfolio.vo.BoardReplyVO;
import kr.co.portfolio.vo.BoardVO;
import kr.co.portfolio.vo.Criteria;

@Service(value="BoardService")
public class BoardServiceImpl implements BoardService{
	
	@Resource(name="BoardDao")
	private BoardDao dao;

	@Override
	public boolean create(BoardVO board) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modify(BoardVO board) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BoardVO view(Long board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(Criteria cri) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardVO> paging(Criteria cri){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(List<Long> board) {
		// TODO Auto-generated method stub
		return false;
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
