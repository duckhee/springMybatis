package kr.co.portfolio.admin.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.portfolio.board.service.BoardReplyService;
import kr.co.portfolio.vo.BoardReplyVO;
import kr.co.portfolio.vo.Criteria;

/**
 * RestFul Controller 
 * @author duckheewon
 *
 */
@RestController
@RequestMapping(value="/admin/boards/replies/")
public class AdminBoardReplyController {
	
	private BoardReplyService service;
	
	/** Create Reply */
	@PostMapping(value="/create", produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> CreateReplies(@RequestBody BoardReplyVO reply){
		int insertCount = service.createBoardReply(reply);
		/** Success Return Http Status Code 200 Failed Retrun Http Status Code 500 */
		return insertCount == 1 ? new ResponseEntity<>("success", HttpStatus.OK) : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/** TODO Delete Only Role have ADMIN, Board Owner, Replyer */
	@PostMapping(value="/{bno}/delete/{rno}")
	public ResponseEntity<String> DeleteReplies(){
		return null;
	}
	
	@GetMapping(value="/{bno}/list/{page}", produces= {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<String> ListReplies(@PathVariable(name="bno")int bno, @PathVariable(name="page")int page, Criteria cri){
		
		return null;
	}
	
	@PostMapping(value="/{bno}/modify/{rno}")
	public ResponseEntity<String> ModifyRrplies(@PathVariable(name="bno")Long bno, @PathVariable(name="rno")Long rno, @RequestBody BoardReplyVO reply){
		
		return null;
	}

}
