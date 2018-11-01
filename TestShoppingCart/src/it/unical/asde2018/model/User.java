package it.unical.asde2018.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String username;
	private List<Product> carrello;
	public User(String username) {
		super();
		this.username = username;
		this.carrello=new ArrayList<>();
	}
	public User(String username, List<Product> carrello) {
		super();
		this.username = username;
		this.carrello = carrello;
	}
	public List<Product> getCarrello() {
		return carrello;
	}
	public String getUsername() {
		return username;
	}
	public void setCarrello(List<Product> carrello) {
		this.carrello = carrello;
	}
	public void setUsername(String username) {
		this.username = username;
	}




}
