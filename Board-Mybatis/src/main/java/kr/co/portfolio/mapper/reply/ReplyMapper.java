package kr.co.portfolio.mapper.reply;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.co.portfolio.vo.BoardReplyVO;
import kr.co.portfolio.vo.Criteria;

public interface ReplyMapper {
	
	/** Search Board reply Count */
	public int getCountByBno(@Param("cri")Criteria cri, @Param("bno")Long bno);
	/** Search Board reply list */
	public List<BoardReplyVO> getListWithPaging(@Param("cri")Criteria cri, @Param("bno")Long bno);

}
