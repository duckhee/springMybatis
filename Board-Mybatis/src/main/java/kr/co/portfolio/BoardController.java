package kr.co.portfolio;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.portfolio.board.service.BoardService;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping(value="/boards/*")
public class BoardController {
		
	@Resource(name="BoardService")
	private BoardService service;

	@GetMapping(value="/create")
	public String CreatePage() {
		return "";
	}
	
	@PostMapping(value="/create")
	public String CreateDo() {
		return "";
	}
	
	@GetMapping(value="/modify")
	public String ModifyPage() {
		return "";
	}
	
	@PostMapping(value="/modify")
	public String ModifyDo() {
		return "";
	}
	
	@GetMapping(value="/view")
	public String ViewPage() {
		return "";
	}
	
	@PostMapping(value="/delete")
	public String DeleteDo() {
		return "";
	}
}
