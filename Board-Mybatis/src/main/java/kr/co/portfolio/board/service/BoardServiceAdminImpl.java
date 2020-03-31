package kr.co.portfolio.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.portfolio.vo.BoardReplyVO;
import kr.co.portfolio.vo.BoardVO;

@Service(value="AdminBoardService")
public class BoardServiceAdminImpl implements BoardService{

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
	public BoardVO view(BoardVO board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> paging() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(BoardVO board) {
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
