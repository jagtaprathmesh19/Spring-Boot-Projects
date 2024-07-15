package com.spring.springproject.services;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.PathVariable;

import com.spring.springproject.models.Posts;
import com.spring.springproject.models.User;
import com.spring.springproject.repository.PostRepository;

import jakarta.transaction.*;

@Service
public class PostServices {
	
	@Autowired
	private PostRepository prepo;
	
	public List<Posts> getAllPostsByUser(User username) {
        return prepo.findAllByUser(username);
    }
	
	public List<Posts> getAllPostsBytitle(String title) {
        return prepo.findAllByTitle(title);
    } 
	
	@Transactional
	public void deleteByTitle(String title) {
		 prepo.deleteByTitle(title);
	}
	
	
	
}
