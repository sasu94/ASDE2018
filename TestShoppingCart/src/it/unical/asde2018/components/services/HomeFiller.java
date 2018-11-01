package it.unical.asde2018.components.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.model.Product;

@Service
public class HomeFiller {
	List<Product> products;
	Map<Integer,Product> db;


	public Product get(int id) {

		return db.get(id);
	}
	public List<Product> getProducts() {
		return products;
	}
	@PostConstruct
	void init() {
		products=new ArrayList<>();
		db=new HashMap<>();

		db.put(1, new Product(1,"Iphone mac","bellissimo iphone della marca mac che costa un botto",2000));
		db.put(2, new Product(2,"Windows Phone","bellissimo windoes phone che costa meno dell'iphone e non ti vendi un rene",2000));
		products.add(new Product(1,"Iphone mac","bellissimo iphone della marca mac che costa un botto",2000));
		products.add(new Product(2,"Windows Phone","bellissimo windoes phone che costa meno dell'iphone e non ti vendi un rene",2000));
	}


}
