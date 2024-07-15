package com.proejct.end_to_end.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proejct.end_to_end.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
