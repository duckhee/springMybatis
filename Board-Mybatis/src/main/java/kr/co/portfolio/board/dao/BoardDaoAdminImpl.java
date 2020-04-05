package kr.co.portfolio.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.portfolio.mapper.reply.ReplyMapper;
import kr.co.portfolio.vo.BoardReplyVO;
import kr.co.portfolio.vo.BoardVO;
import kr.co.portfolio.vo.Criteria;

@Repository(value="AdminBoardDao")
public class BoardDaoAdminImpl implements BoardDao{
	
	@Autowired
	private SqlSession session;
	
	@Autowired
	private ReplyMapper mapper;
	
	@Override
	public boolean create(BoardVO board) {
		// TODO Auto-generated method stub
		return session.insert("BoardInsert", board) == 1;
	}

	@Override
	public BoardVO view(Long board) {
		// TODO Auto-generated method stub
		return session.selectOne("BoardView", board);
	}

	@Override
	public boolean modify(BoardVO board) {
		// TODO Auto-generated method stub
		return session.update("ModiifyBoard", board) == 1;
	}

	@Override
	public boolean delete(List<Long> board, int count) {
		// TODO Auto-generated method stub
		return session.delete("DeleteBoard", board) == count;
	}


	@Override
	public int count(Criteria cri) {
		// TODO Auto-generated method stub
		return session.selectOne("BoardCount", cri);
	}
 
	@Override
	public List<BoardVO> paging(Criteria cri) {
		// TODO Auto-generated method stub
		return session.selectList("BoardPaging", cri);
	}
	
	/** Board Reply DAO */

	@Override
	public boolean createReply(BoardReplyVO reply) {
		// TODO Auto-generated method stub
		return mapper.createBoardReply(reply) == 1;
	}

	@Override
	public BoardReplyVO viewReply(Long rno) {
		// TODO Auto-generated method stub
		return mapper.viewBoardReply(rno);
	}

	@Override
	public int countReply(Criteria cri, Long bno) {
		// TODO Auto-generated method stub
		return mapper.getCountByBno(cri, bno);
	}

	@Override
	public List<BoardReplyVO> listReply(Criteria cri, Long bno) {
		// TODO Auto-generated method stub
		return mapper.getListWithPaging(cri, bno);
	}

	@Override
	public boolean modifyReply(BoardReplyVO reply) {
		// TODO Auto-generated method stub
		return mapper.updateBoardReply(reply) == 1;
	}

	@Override
	public boolean deleteReply(BoardReplyVO reply) {
		// TODO Auto-generated method stub
		return mapper.deleteBoardReply(reply) == 1;
	}

}
