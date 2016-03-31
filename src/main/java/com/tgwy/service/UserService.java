package com.tgwy.service;

import java.util.List;

import com.tgwy.entity.User;


public interface UserService {
	
	public List<User> listAll(User user);
	public int insert(User user);
}
