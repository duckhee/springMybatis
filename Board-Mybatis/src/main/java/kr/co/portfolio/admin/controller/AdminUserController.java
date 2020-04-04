package kr.co.portfolio.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.portfolio.user.service.UserService;
import kr.co.portfolio.vo.UserVO;
import lombok.extern.log4j.Log4j;

import javax.annotation.Resource;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Log4j
@Controller
@RequestMapping(value="/admin/users/*")
public class AdminUserController {

	@Resource(name="AdminUserService")
	private UserService service;
	
	@GetMapping(value= {"","/"})
	public String MainPage() {
		log.info("Main User Page");
		return "redirect:/admin/users/profile";
	}
	
	@GetMapping(value="/signup")
	public String SignUpPage() {
		log.info("registe user page");
		return "admin/user/signUpPage";
	}
	
	@PostMapping(value="/signup")
	public String SignUpDo(@ModelAttribute("user")UserVO user, RedirectAttributes flash) {
		log.info("user Registe :" + user);
		@SuppressWarnings("unused")
		boolean flags = false;
		try {
			/** User */
			flags = service.signup(user);
		}catch (DuplicateKeyException Error) {
			// TODO: handle exception
			flags = false;
			log.info("ALREADY HAVE USER");
			/** Flash Message */
			flash.addAttribute("msg", "Already have user");
			return "redirect:/admin/users/signup";
		}
		if(flags = true) {
			/** Sign up User Success */
			return "redirect:/amdin/users/login";
			
		}
		/** Server Error */
		return "redirect:/admin/users/signup";
		
	}
	
	@GetMapping(value="/login")
	public String LoginPage() {
		return "admin/user/loginPage";
	}
	
	@PostMapping(value="/login")
	public String LoginDo() {
		return "redirect:/admin";
	}
	
	@PostMapping(value="/logout")
	public String LogOutDo() {
		return "redirect:/admin/users/login";
	}
	
	@GetMapping(value="/profile")
	public String ProfilePage() {
		log.info("Admin Profile");
		return "admin/user/profilePage";
	}
	
	@GetMapping(value="/modify")
	public String ModifyPage(@RequestParam(name="email", required=false)String email, RedirectAttributes flash, Model model) {
		return "";
	}
	
	@PostMapping(value="/modify")
	public String ModifyDo(@ModelAttribute("user")UserVO user, RedirectAttributes flash) {
		return "";
	}
	
	@PostMapping(value="/delete")
	public String DeleteDo() {
		return "";
	}
}
