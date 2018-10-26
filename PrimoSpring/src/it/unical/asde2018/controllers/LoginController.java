package it.unical.asde2018.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@PostMapping("login")
	public String performLogin(HttpSession session, @RequestParam String username,@RequestParam String pass) {
		if(username.equals("ciccio")&& pass.equals("ciccio"))
			return "index";
		return "login";
	}

}
