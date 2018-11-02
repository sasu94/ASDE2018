package it.unical.asde2018.components.controllers;

import java.text.ParseException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.components.services.BookingService;
import it.unical.asde2018.model.User;

@Controller
public class BookerController {
	@Autowired
	BookingService service;

	@GetMapping("/prenota")
	public String goToPrenota() {
		return "prenota";
	}

	@PostMapping("/prenota")
	public String performPrenotation(@RequestParam String aula,@RequestParam String start, @RequestParam String end, HttpSession session, Model model) {
		User u =(User) session.getAttribute("user");
		try {
			String prenota = service.prenota(aula,start,end,u);
			if(!prenota.equals("")) {
				model.addAttribute("error", "already booked. "+prenota);
				return "prenota";
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}
}
