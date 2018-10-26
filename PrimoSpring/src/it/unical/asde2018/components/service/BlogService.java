package it.unical.asde2018.components.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import it.unical.asde2018.model.Comment;
import it.unical.asde2018.model.Post;
import it.unical.asde2018.model.User;
@Service
public class BlogService {

	private List<Post> posts;
	
	@PostConstruct
	public void init() {
		posts=new ArrayList<>();
		User u=new User("Giovanni");
		Post p=new Post("we bello", "che bella la pizza", new Date(), u);
		User u2=new User("Filippo");
		
		
		Post p2=new Post("we brutto", "non mi piace la pizza", new Date(), u2);
		p2.addComment(new Comment(u, new Date(), "ma vat'amazza"));
		
	}
	
	public List<Post> getAllPosts(){
		return posts;
	}
}
