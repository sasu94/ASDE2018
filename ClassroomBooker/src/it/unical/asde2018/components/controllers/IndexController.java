package it.unical.asde2018.components.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.unical.asde2018.components.services.BookingService;

@Controller
public class IndexController {
	@Autowired
	BookingService booker;

	@GetMapping("/")
	private String goToIndex(Model model, HttpSession session) {
		if(session.getAttribute("user")!=null) {
			model.addAttribute("prenotazioni",booker.getLista());
			return "index";
		}return "login";

	}
}
