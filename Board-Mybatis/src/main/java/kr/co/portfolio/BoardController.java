package kr.co.portfolio;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.portfolio.board.service.BoardService;
import kr.co.portfolio.vo.BoardVO;
import kr.co.portfolio.vo.Criteria;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping(value="/boards/*")
public class BoardController {
		
	@Resource(name="BoardService")
	private BoardService service;
	
	@GetMapping(value= {"","/"})
	public String Index() {
		return "redirect:/boards/list";
	}

	@GetMapping(value="/create")
	public String CreatePage() {
		return "";
	}
	
	@PostMapping(value="/create")
	public String CreateDo(@ModelAttribute("board")BoardVO board, RedirectAttributes flash) {
		return "";
	}
	
	@GetMapping(value="/modify")
	public String ModifyPage(@RequestParam(name="bno", required=false)Long bno, Model model, RedirectAttributes flash) {
		return "";
	}
	
	@PostMapping(value="/modify")
	public String ModifyDo(@ModelAttribute("board")BoardVO board, RedirectAttributes flash) {
		return "";
	}
	
	@GetMapping(value="/view")
	public String ViewPage(@RequestParam(name="bno", required=false)Long bno, Model model) {
		return "";
	}
	
	@GetMapping(value="/list")
	public String Paging(Criteria cri, Model model) {
		return "";
	}
	
	@PostMapping(value="/delete")
	public String DeleteDo() {
		return "";
	}
}
