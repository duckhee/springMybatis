package kr.co.portfolio.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.portfolio.user.service.UserService;
import lombok.extern.log4j.Log4j;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Log4j
@Controller
@RequestMapping(value="/admin/users/*")
public class AdminUserController {

	@Resource(name="AdminUserService")
	private UserService service;
	
	@GetMapping(value= {"","/"})
	public String MainPage() {
		log.info("Main User Page");
		return "";
	}
	
	@GetMapping(value="/signUp")
	public String SignUpPage() {
		return "";
	}
	
	@PostMapping(value="/signUp")
	public String SignUpDo() {
		return "";
	}
	
	@GetMapping(value="/login")
	public String LoginPage() {
		return "";
	}
	
	@PostMapping(value="/login")
	public String LoginDo() {
		return "";
	}
	
	@PostMapping(value="/logout")
	public String LogOutDo() {
		return "";
	}
	
	@GetMapping(value="/profile")
	public String ProfilePage() {
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
	
	@PostMapping(value="/delete")
	public String DeleteDo() {
		return "";
	}
}
