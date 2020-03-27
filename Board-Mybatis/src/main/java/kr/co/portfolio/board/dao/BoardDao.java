package kr.co.portfolio.board.dao;

import java.util.List;

import kr.co.portfolio.vo.BoardReplyVO;
import kr.co.portfolio.vo.BoardVO;

public interface BoardDao {
	/** Create Board */
	public boolean create(BoardVO board);
	/** View Board */
	public BoardVO view(BoardVO board);
	/** Paging Board */
	public List<BoardVO> paging();
	/** Modify Board */
	public boolean modify(BoardVO board);
	/** Delete Board */
	public boolean delete(BoardVO board);
	
	/** Create Reply */
	public boolean createReply(BoardReplyVO reply);
	/** View Reply */
	public BoardReplyVO viewReply(BoardReplyVO reply);
	/** List Reply */
	public List<BoardReplyVO> listReply(BoardReplyVO reply);
	/** Modify Reply */
	public boolean modifyReply(BoardReplyVO reply);
	/** Delete Reply */
	public boolean deleteReply(BoardReplyVO reply);
}
