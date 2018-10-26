package it.unical.asde2018.blog.model;

import java.util.Date;

public class Comment {

	private User commenter;
	private String corpus;
	private Date creationDate;
	
	
	public Comment(User commenter, String corpus, Date creationDate) {
		super();
		this.commenter = commenter;
		this.corpus = corpus;
		this.creationDate = creationDate;
	}
	public User getCommenter() {
		return commenter;
	}
	public void setCommenter(User commenter) {
		this.commenter = commenter;
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
	
}
