package it.unical.asde2018.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {
	
	@PostMapping("/")
	public String goToHomePage(Model model,@RequestParam String username) {
		model.addAttribute("user",username);
		model.addAttribute("currentTime",new Date());
		return "index";
	}
	
	
	@GetMapping("/")
	public String goToLogin() {
		
		return "login";
	}
}
