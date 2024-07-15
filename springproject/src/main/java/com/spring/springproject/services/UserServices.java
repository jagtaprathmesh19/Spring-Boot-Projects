package com.spring.springproject.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springproject.repository.*;
import com.spring.springproject.models.*;

@Service
public class UserServices{
	
	@Autowired
	private UserRepository repo;
	
	
	public User getUserByUsername(String username) {
        return repo.findByUsername(username);
    }


}
