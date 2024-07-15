package com.roleauth.roleauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roleauth.roleauth.models.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

}
