package com.spring.springproject.controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import org.springframework.beans.factory.annotation.*;

import com.spring.springproject.services.*;
import com.spring.springproject.repository.*;
import com.spring.springproject.models.*;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
    private UserRepository repo;
	@Autowired
	private UserServices userservice;
	
	
	@GetMapping
	public String welcome() {
		return "Welcome!";
	}
	
	@PostMapping("createuser")
	public String createuser(@RequestBody User user){
		repo.save(user);
		return "Data Inserted!";
	}
	
   @GetMapping("showuser")
   public List<User> showUser(){
	   return repo.findAll();
   }
   
   @GetMapping("showuserbyid/{id}")
   public Optional<User> showUserById(@PathVariable(value="id") Long id){
       return repo.findById(id);
   }
   
   @PutMapping("update/{id}")
   public User updateuser(@RequestBody User user, @PathVariable Long id) {
	   user.setId(id);
	   return repo.save(user);
   }
   
   @DeleteMapping("delete/{id}")
   public void deleteuser( @PathVariable Long id) {
	   repo.deleteById(id);
   }
   
   @GetMapping("userbyuname/{username}")
   public User getUserByUsername(@PathVariable String username) {
	   return userservice.getUserByUsername(username);
   }
}

