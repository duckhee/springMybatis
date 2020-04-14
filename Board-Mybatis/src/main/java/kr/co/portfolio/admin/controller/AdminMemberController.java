package kr.co.portfolio.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.portfolio.user.service.UserService;
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
	public String RegisteDo() {
		return "";
	}
	
	@GetMapping(value="/list")
	public String ListPage() {
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
