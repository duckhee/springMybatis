package kr.co.portfolio.board.service;

import java.util.List;

import kr.co.portfolio.vo.BoardReplyVO;
import kr.co.portfolio.vo.BoardVO;
import kr.co.portfolio.vo.Criteria;

public interface BoardService {
	/** Create Board */
	public boolean create(BoardVO board);
	/** Update Board */
	public boolean modify(BoardVO board);
	/** View Board */
	public BoardVO view(Long board);
	/** Count Board */
	public int count(Criteria cri);
	/** Paging Board */
	public List<BoardVO> paging(Criteria cri);
	/** Delete Board */
	public boolean delete(List<Long> board);
	
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
