package it.unical.asde2018.blog.components.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;


import org.springframework.stereotype.Service;

import it.unical.asde2018.blog.model.Comment;
import it.unical.asde2018.blog.model.Post;
import it.unical.asde2018.blog.model.User;

@Service
public class BlogService {
	List<Post> posts;
	
	public List<Post> getAllPost(){
		return posts;
	}
	
	@PostConstruct
	public void init() {
		posts=new ArrayList<>();
		User u=new User("giovanni");
		Post p=new Post("we bello", "mi piace la pizza",u, new Date());
		User u2=new User("filippo");
		Post p2=new Post("caiocs", "asdasd",u2, new Date());
		p2.addComment(new Comment(u, "fai schifo", new Date()));
		posts.add(p);
		posts.add(p2);
	}
}
