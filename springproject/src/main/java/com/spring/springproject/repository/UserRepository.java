package com.spring.springproject.repository;

import com.spring.springproject.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String Username);
	
	

}
