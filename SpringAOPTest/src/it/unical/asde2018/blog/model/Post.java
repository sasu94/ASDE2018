package it.unical.asde2018.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private String title,corpus;
	private User poster;
	private Date creationDate;
	private List<Comment>comments;
	
	public void addComment(Comment c) {
		comments.add(c);
	}
	
	public Post(String title, String corpus, User poster, Date creationDate) {
		super();
		this.title = title;
		this.corpus = corpus;
		this.poster = poster;
		this.creationDate = creationDate;
		comments=new ArrayList<>();
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
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
	public User getPoster() {
		return poster;
	}
	public void setPoster(User poster) {
		this.poster = poster;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	

}
