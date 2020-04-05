package kr.co.portfolio.mapper.reply;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.co.portfolio.vo.BoardReplyVO;
import kr.co.portfolio.vo.Criteria;

public interface ReplyMapper {
	/** Insert Board reply */
	public int createBoardReply(BoardReplyVO reply);
	/** View Board reply */
	public BoardReplyVO viewBoardReply(Long rno);
	/** Update Board reply */
	public int updateBoardReply(BoardReplyVO reply);
	/** Delete Board reply */
	public int deleteBoardReply(BoardReplyVO reply);
	/** Count Board reply */
	public int countBoardReply(Criteria cri);
	/** Search Board reply Count */
	public int getCountByBno(@Param("cri")Criteria cri, @Param("bno")Long bno);
	/** Search Board reply list */
	public List<BoardReplyVO> getListWithPaging(@Param("cri")Criteria cri, @Param("bno")Long bno);

}
