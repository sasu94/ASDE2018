package it.unical.asde2018.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private String title,corpus;
	private Date creationDate;
	private User poster;
	private List<Comment> comments;
	
	
	public Post(String title, String corpus, Date creationDate, User poster) {
		super();
		this.title = title;
		this.corpus = corpus;
		this.creationDate = creationDate;
		this.poster = poster;
		comments=new ArrayList<>();
	}
	public void addComment(Comment c) {
		comments.add(c);
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCorpus() {
		return corpus;
	}
	public void setCorpus(String corpus) {
		this.corpus = corpus;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public User getPoster() {
		return poster;
	}
	public void setPoster(User poster) {
		this.poster = poster;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
