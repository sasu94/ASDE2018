package it.unical.asde2018.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.unical.asde2018.components.services.HomeFiller;

@Controller
public class IndexController {
	@Autowired
	HomeFiller homeFiller;

	@GetMapping("/")
	public String goToIndex(HttpSession session,Model model){
		if(session.getAttribute("user")!=null) {
			model.addAttribute("products", homeFiller.getProducts());
			return "index";
		}
		return "login";
	}

}
