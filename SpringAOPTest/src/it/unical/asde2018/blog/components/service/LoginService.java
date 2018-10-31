package it.unical.asde2018.blog.components.service;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.blog.model.Credential;

@Service
public class LoginService {
	public Set<Credential> credentials;
	
	
	@PostConstruct
	private void init() {
		credentials=new HashSet<>();
		credentials.add(new Credential("asd", "asd"));
		credentials.add(new Credential("ciccio", "pasticcio"));
		credentials.add(new Credential("pippo", "pluto"));

	}
	
	public boolean attemptLogin(String username, String password) {
		return credentials.contains(new Credential(username,password));
	}
	
}
