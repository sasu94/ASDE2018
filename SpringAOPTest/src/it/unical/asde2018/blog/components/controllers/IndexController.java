package it.unical.asde2018.blog.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.unical.asde2018.blog.components.service.BlogService;


@Controller
public class IndexController {
	@Autowired
	private BlogService blogService;
	
	@GetMapping("/")
	public String goToIndex(Model model,HttpSession session) {
		if(session.getAttribute("user")!=null) {
			model.addAttribute("posts", blogService.getAllPost());
			return "index";
		}return "login";
	}

}
