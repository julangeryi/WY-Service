package com.tgwy.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.tgwy.entity.User;


public class UserDetailService implements UserDetailsService{

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = new User();
		System.out.println(user);
		user.setUsername(username);
		user.setPassword("admin");
		return user;
	}

}
