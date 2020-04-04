package kr.co.portfolio.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.portfolio.board.service.BoardService;
import kr.co.portfolio.vo.BoardVO;
import kr.co.portfolio.vo.Criteria;

@Controller
@RequestMapping(value="/admin/boards/*")
public class AdminBoardController {

	@Resource(name="AdminBoardService")
	private BoardService service;
	
	@GetMapping(value= {"/", ""})
	public String Index() {
		return "";
	}
	
	@GetMapping(value="/create")
	public String CreatePage(@ModelAttribute("board") BoardVO board) {
		return "";
	}
	
	@PostMapping(value="/create")
	public String CreateDo(@ModelAttribute("board")BoardVO board, RedirectAttributes flash) {
		return "";
	}
	
	@GetMapping(value="/update")
	public String ModfiyPage(@ModelAttribute("board")BoardVO board, RedirectAttributes flash) {
		return "";
	}
	
	@PostMapping(value="/update")
	public String ModifyDo(@ModelAttribute("board")BoardVO board, RedirectAttributes flash) {
		return "";
	}
	
	@GetMapping(value="/view")
	public String ViewPage(@RequestParam(name="bno", required=false)Long bno, RedirectAttributes flash) {
		return "";
	}
	
	@GetMapping(value="/list")
	public String PagingPage(Criteria cri) {
		return "";
	}
}
