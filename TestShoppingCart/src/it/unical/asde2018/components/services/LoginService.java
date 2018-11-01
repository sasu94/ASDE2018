package it.unical.asde2018.components.services;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	Map<String,String> db;

	@PostConstruct
	public void init() {
		db=new HashMap<>();
		db.put("asd", "asd");
	}

	public boolean performLogin(String username,String password) {
		if(db.get(username)!=null&&db.get(username).equals(password))
			return true;
		return false;

	}

}
