package it.unical.asde2018.components.services;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	Map<String, String>db;
	public boolean checkUser(String username,String password){
		return(db.containsKey(username)&&db.get(username).equals(password));
	}

	@PostConstruct
	public void init() {
		db=new HashMap<>();
		db.put("asd", "asd");
		db.put("zabatta", "staila");
	}}
