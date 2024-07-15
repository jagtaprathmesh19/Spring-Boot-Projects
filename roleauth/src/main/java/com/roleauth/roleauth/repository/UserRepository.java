package com.roleauth.roleauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roleauth.roleauth.models.*;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String username);

}
