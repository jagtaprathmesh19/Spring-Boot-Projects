//package com.proejct.end_to_end.services;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.proejct.end_to_end.models.User;
//import com.proejct.end_to_end.repository.UserRepository;
//
//@Service
//public class UserService implements UserDetailsService {
//
//	private UserRepository urepo;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = urepo.findByUsername(username);
//		if (user == null) {
//			throw new UsernameNotFoundException("User not Found!!");
//		}
//		return new User();
//	}
//
//}
