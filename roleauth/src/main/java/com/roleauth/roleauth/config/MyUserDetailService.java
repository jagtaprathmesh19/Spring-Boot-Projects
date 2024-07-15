package com.roleauth.roleauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.roleauth.roleauth.models.User;
import com.roleauth.roleauth.repository.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository urepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= urepo.findByEmail(username);
		if(user==null) {
			throw new UsernameNotFoundException("User not found with username: "+username);
		}
		return new MyUser(user);
	}

}

