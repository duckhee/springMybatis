package kr.co.portfolio.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin/*")
public class AdminMainController {

	@GetMapping(value= {"","/"})
	public String MainPage() {
		return "";
	}

}
