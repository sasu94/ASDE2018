package it.unical.asde2018.components.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.unical.asde2018.components.services.HomeFiller;
import it.unical.asde2018.model.Product;
import it.unical.asde2018.model.User;

@Controller
public class CartController {
	@Autowired
	HomeFiller homeFiller;
	@GetMapping("/cart")
	public String goToCart(HttpSession session,Model model,@RequestParam(required=false) String id,@RequestParam(required=false) String remove){
		User u=(User) session.getAttribute("user");
		List<Product> carrello = u.getCarrello();
		if(id!=null) {
			carrello.add(homeFiller.get(Integer.parseInt(id)));
			return "redirect:/";
		}else if(remove!=null) {
			carrello.removeIf((Product p)->p.getId()==Integer.parseInt(remove));
			return "redirect:/cart";
		}
		if(session.getAttribute("user")!=null) {
			int somma=0;
			for (Product p:carrello) {
				somma+=p.getPrice();
			}
			model.addAttribute("somma", somma);
			model.addAttribute("list", carrello);
			return "cart";
		}return "redirect:/";
	}
}
