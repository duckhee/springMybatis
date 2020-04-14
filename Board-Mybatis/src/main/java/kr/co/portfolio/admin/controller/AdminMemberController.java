package kr.co.portfolio.admin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.portfolio.user.service.UserService;
import kr.co.portfolio.vo.Criteria;
import kr.co.portfolio.vo.UserVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping(value="/admin/members/*")
public class AdminMemberController {

	@Resource(name="AdminUserService")
	private UserService service;
	
	@GetMapping(value= {"","/"})
	public String MainPage() {
		return "redirect:/admin/members/list";
	}
	
	@GetMapping(value="/registe")
	public String RegistePage() {
		return "";
	}
	
	@PostMapping(value="/registe")
	public String RegisteDo(UserVO user, RedirectAttributes flash) {
		return "";
	}
	
	@GetMapping(value="/list")
	public String ListPage(Criteria cri, Model model, RedirectAttributes flash) {
		//List<UserVO> list;
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
	
	@GetMapping(value="/detail")
	public String DetailPage() {
		return "";
	}
	
	@PostMapping(value="/delete")
	public String DeleteDo() {
		return "";
	}
	
}
