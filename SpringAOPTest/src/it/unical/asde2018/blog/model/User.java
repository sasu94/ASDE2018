package it.unical.asde2018.blog.model;

public class User {

private String nickname;


public User(String nickname) {
	super();
	this.nickname = nickname;
}

public String getNickname() {
	return nickname;
}

public void setNickname(String nickname) {
	this.nickname = nickname;
}
}
