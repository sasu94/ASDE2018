package it.unical.asde2018.model;

public class User {
	private String username;
	private String immagine;

	public User(String username) {
		super();
		this.username = username;
	}

	public User(String username, String immagine) {
		super();
		this.username = username;
		this.immagine = immagine;
	}

	public String getImmagine() {
		return immagine;
	}

	public String getUsername() {
		return username;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
