package kr.co.portfolio.board.dao;

import java.util.List;

import kr.co.portfolio.vo.BoardReplyVO;
import kr.co.portfolio.vo.BoardVO;
import kr.co.portfolio.vo.Criteria;

public interface BoardDao {
	/** Create Board */
	public boolean create(BoardVO board);
	/** View Board */
	public BoardVO view(Long board);
	/** Count Board */
	public int count(Criteria cri);
	/** Paging Board */
	public List<BoardVO> paging(Criteria cri);
	/** Modify Board */
	public boolean modify(BoardVO board);
	/** Delete Board */
	public boolean delete(List<Long> board, int count);
	
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
