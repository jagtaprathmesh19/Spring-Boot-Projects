package com.roleauth.roleauth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.roleauth.roleauth.models.User;
import com.roleauth.roleauth.repository.UserRepository;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	private UserRepository urepo;

	@GetMapping("/user/get")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<User> home() {
		List<User> user = urepo.findAll();
		return user;
	}
	
	@GetMapping("/get")
	public String get() {
		return "form";
	}
	
	
}
