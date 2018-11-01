package it.unical.asde2018.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.components.services.LoginService;
import it.unical.asde2018.model.User;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;

	@GetMapping("/login")
	public String goToLogin(){
		return "login";
	}

	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";	}

	@PostMapping("/login")
	public String performLogin(@RequestParam String username,@RequestParam String password, Model model,HttpSession session) {
		if(loginService.performLogin(username, password)) {
			session.setAttribute("user", new User(username));
			return "redirect:/";
		}
		model.addAttribute("error", "wrong credentials");
		return "login";
	}
}
