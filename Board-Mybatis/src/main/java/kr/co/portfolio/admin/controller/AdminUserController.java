package kr.co.portfolio.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
}
