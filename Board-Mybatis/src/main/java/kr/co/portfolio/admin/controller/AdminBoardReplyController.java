package kr.co.portfolio.admin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin/boards/replies/*")
public class AdminBoardReplyController {
	
	@PostMapping(value="/create")
	public ResponseEntity<String> CreateReplies(){
		return null;
	}

}
