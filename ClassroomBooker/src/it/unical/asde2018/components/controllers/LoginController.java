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
	LoginService service;

	@GetMapping("/login")
	public String goToLogin(){
		return "login";
	}

	@PostMapping("/login")
	public String performLogin(@RequestParam String username,@RequestParam String password, HttpSession session,Model model) {
		if(service.checkUser(username, password)) {
			session.setAttribute("user", new User(username));
			return "redirect:/";
		}model.addAttribute("error", "mi dispiace compà");
		return "login";
	}
}
