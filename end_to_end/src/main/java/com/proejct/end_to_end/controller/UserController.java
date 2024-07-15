package com.proejct.end_to_end.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.proejct.end_to_end.models.User;
import com.proejct.end_to_end.repository.UserRepository;
import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository urepo;
	
	@GetMapping("/")
	public String home() {
		return "This is User home";
	}
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return urepo.save(user);
	}
	
	@GetMapping("/show")
	public List<User> showAllUser(){
		return urepo.findAll();
	}
	
	@GetMapping("/show/{id}")
	public Optional<User> showById(@PathVariable long id){
		return urepo.findById(id);
	}
	
	@GetMapping("/showu/{uname}")
	public User showByUsername(@PathVariable String uname){
		return urepo.findByUsername(uname);
	}
	
	@PutMapping("/update/{id}")
	public User updateById(@PathVariable("id") long id, @RequestBody User user){
		user.setId(id);
		return urepo.save(user);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteById( @PathVariable Long id) {
		 urepo.deleteById(id);
		 return "Data Deleted";
	 }

	
}
