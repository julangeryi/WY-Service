package com.tgwy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgwy.dao.CommonDao;
import com.tgwy.entity.User;
import com.tgwy.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private CommonDao dao;
	
	public List<User> listAll(User user) {
		List<User> users = dao.selectList("com.tgwy.entity.selectUserByID", user);
		return users;
	}

	public int insert(User user) {
//		int i = dao.insert("user.mapper.insert", user);
//		return i;
		return 0;
	}

}
