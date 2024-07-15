package com.spring.springproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.springproject.repository.*;
import com.spring.springproject.services.*;
import com.spring.springproject.models.*;

@RestController
@RequestMapping("/postapi")
public class PostController {
	
	@Autowired
	private PostRepository prepo;
//	@Autowired
//    private UserRepository urepo;
	@Autowired
	private PostServices service;
	
	
	@GetMapping
	public String welcome() {
		return "Welcome To post!";
	}
	
	@PostMapping("createpost")
	public String createpost(@RequestBody Posts post){
		prepo.save(post);
		return "Data Inserted!";
	}
	
	@GetMapping("showpost")
	public List<Posts> showPost(){
		   return prepo.findAll();
	 }
	
	@GetMapping("showpostbyid/{id}")
	public Optional<Posts> showPostById(@PathVariable(value="id") Long id){
	       return prepo.findById(id);
	}
	
	@GetMapping("postbyuser/{username}")
	public List<Posts> getAllPostByUser(@PathVariable(value="username") User username){
		return service.getAllPostsByUser(username);
	}
	
	@GetMapping("postbytitle/{title}")
	public List<Posts> getPostByTitle(@PathVariable(value="title") String title){
		return service.getAllPostsBytitle(title);
	}
	
	@PutMapping("updatepostcontent/{id}")
	public void updatePostContent(@PathVariable Long id, @RequestBody String content) {
		Optional<Posts> post = prepo.findById(id);
		Posts posts = post.get();
		posts.setContent(content);	
	}
	
	@DeleteMapping("deletepostbytitle/{title}")
	public void deleteByTitle(@PathVariable String title) {
		service.deleteByTitle(title);
	}

}
