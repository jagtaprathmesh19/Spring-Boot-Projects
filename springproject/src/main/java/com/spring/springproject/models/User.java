package com.spring.springproject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id // Specifies the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the generation strategy for the primary key
    private Long id;
    
    @Column(name = "username", nullable = false, unique = true) // Specifies the column properties
    private String username;
	
	public User() {
			
		}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
