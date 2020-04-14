package kr.co.portfolio;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.portfolio.user.service.UserService;

@Controller
@RequestMapping(value="/users/*")
public class UserController {
	
	@Resource(name="UserService")
	private UserService service;
	
	@GetMapping(value= {"","/"})
	public String Index() {
		return "redirect:/users/login";
	}
	
	@GetMapping(value="/login")
	public String LoginPage() {
		return "";
	}
	
	@PostMapping(value="/login")
	public String LoginDo() {
		return "";
	}
	
	@GetMapping(value="/signup")
	public String SignUpPage() {
		return "";
	}
	
	@PostMapping(value="/signup")
	public String SignUpDo() {
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
	
	@PostMapping(value="/logout")
	public String LogOutDo() {
		return "";
	}
}
