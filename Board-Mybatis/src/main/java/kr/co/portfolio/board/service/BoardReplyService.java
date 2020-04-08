package kr.co.portfolio.board.service;

import java.util.List;



import kr.co.portfolio.vo.BoardReplyVO;
import kr.co.portfolio.vo.Criteria;

public interface BoardReplyService {

	/** Insert Board reply */
	public int createBoardReply(BoardReplyVO reply);
	/** View Board reply */
	public BoardReplyVO viewBoardReply(Long rno);
	/** Update Board reply */
	public int updateBoardReply(BoardReplyVO reply);
	/** Delete Board reply */
	public int deleteBoardReply(Long rno);
	/** Count Board reply */
	public int countBoardReply(Criteria cri);
	/** Search Board reply Count */
	public int getCountByBno(Criteria cri, Long bno);
	/** Search Board reply list */
	public List<BoardReplyVO> getListWithPaging(Criteria cri, Long bno);
}
