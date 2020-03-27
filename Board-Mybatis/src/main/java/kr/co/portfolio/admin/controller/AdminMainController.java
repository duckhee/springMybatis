package kr.co.portfolio.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping(value="/admin")
public class AdminMainController {

	@GetMapping(value= {"","/"})
	public String MainPage() {
		log.info("Admin Main Controller");
		return "admin/index";
	}

}
