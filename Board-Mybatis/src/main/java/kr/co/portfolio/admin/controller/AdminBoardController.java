package kr.co.portfolio.admin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.portfolio.board.service.BoardService;
import kr.co.portfolio.vo.BoardVO;
import kr.co.portfolio.vo.Criteria;
import kr.co.portfolio.vo.PageDTO;

@Controller
@RequestMapping(value="/admin/boards/*")
public class AdminBoardController {

	@Resource(name="AdminBoardService")
	private BoardService service;
	
	@GetMapping(value= {"/", ""})
	public String Index() {
		return "redirect:/admin/boards/list";
	}
	
	@GetMapping(value="/create")
	public String CreatePage() {
		return "admin/board/createPage";
	}
	
	@PostMapping(value="/create")
	public String CreateDo(@ModelAttribute("board")BoardVO board, RedirectAttributes flash) {
		//TODO delete if use security
		if(board.getWriter().length() == 0) {
			/** Parameter Check writer */
			flash.addAttribute("msg", "Login Frist.");
			return "redirect:/admin/boards/create";
		}
		/** Board Title Check */
		if(board.getTitle().length() == 0) {
			flash.addAttribute("msg", "Title is not null.");
			return "redirect:/admin/boards/create";
		}
		/** Create Board */
		if(service.create(board)) {
			/** Create Board Success */
			flash.addAttribute("msg", "Board Create Success");
			return "redirect:/admin/baords/list";
		}else {
			/** Create Board Failed */
			flash.addAttribute("msg", "Board Create Failed.");
			return "redirect:/admin/boards/create";
		}
		
	}
	
	@GetMapping(value="/update")
	public String ModfiyPage(@RequestParam(name="bno", required=false)Long bno, Model model, RedirectAttributes flash) {
		/** Get Board Service Call */
		BoardVO getBoard = service.view(bno);
		/** Not have Board */
		if(getBoard == null) {
			/** Flash Message Add */
			flash.addAttribute("msg", "Board is deleted");
			/** Redirect List Page */
			return "redirect:/admin/boards/list";
		}
		/** Model Set Get Board */
		model.addAttribute("board", getBoard);
		return "admin/board/modifyPage";
	}
	
	@PostMapping(value="/update")
	public String ModifyDo(@ModelAttribute("board")BoardVO board, RedirectAttributes flash) {
		
		return "redirect:/admin/boards/list";
	}
	
	@GetMapping(value="/view")
	public String ViewPage(@RequestParam(name="bno", required=false)Long bno, Model model, RedirectAttributes flash) {
		/** Get Board Service Call */
		BoardVO getBoard = service.view(bno);
		/** Not have Board */
		if(getBoard == null) {
			/** Flash Message Add */
			flash.addAttribute("msg", "Board is deleted");
			/** Redirect List Page */
			return "redirect:/admin/boards/list";
		}
		/** Model Set Get Board */
		model.addAttribute("board", getBoard);
		return "admin/board/viewPage";
	}
	
	@GetMapping(value="/list")
	public String PagingPage(Criteria cri, Model model) {
		/** Get Board List */
		List<BoardVO> list = service.paging(cri);
		/** Model Save Board List Value */
		model.addAttribute("list", list);
		/** Get Board total Number */
		int total = service.count(cri);
		/** Model Save Board PageMaker */
		model.addAttribute("pageMaker", new PageDTO(cri, total));
		return "admin/board/listPage";
	}
	
	@PostMapping(value="/delete")
	@ResponseBody
	public String deletteDo() {
		return "";
	}
}
