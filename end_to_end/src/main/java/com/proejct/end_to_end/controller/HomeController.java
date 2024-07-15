package com.proejct.end_to_end.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/normal")
	public ResponseEntity<String> normalUser(){
		return ResponseEntity.ok("This is normal User");
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> adminUser(){
		return ResponseEntity.ok("This is Admin User");
	}
	
	@GetMapping("/public")
	public ResponseEntity<String> publicUser(){
		return ResponseEntity.ok("This is public User");
	}
}
