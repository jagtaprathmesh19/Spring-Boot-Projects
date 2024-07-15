package com.spring.springproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springproject.models.*;

public interface PostRepository extends JpaRepository<Posts, Long>{
	
	List<Posts> findAllByUser(User username);
	
	List<Posts> findAllByTitle(String title);
	
	List<Posts> findAllByLikes(int likes);
	
	List<Posts> findAllByCategory(String category);
	
	void deleteByTitle(String title);

	
}
