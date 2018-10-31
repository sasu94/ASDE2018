package it.unical.asde2018.blog.components.controllers;





import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.blog.components.service.LoginService;

@Controller
public class LoginController {
	 
	
	@Autowired
	LoginService database;
	
	@GetMapping("/login")
	public String goToLogin(Model model) {
		return "login";
	}
	
	@PostMapping("/login")
	public String performLogin(@RequestParam String username,@RequestParam String password,HttpSession session,Model model) {
		
		if (database.attemptLogin(username, password)) {
			session.setAttribute("user", username);
			return "redirect:/";
		}
		String s = "wrong credentials";
		model.addAttribute("error", s);
		return "login";
		
	}
	
	@PostMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/login";
		
	}
}
