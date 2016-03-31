package com.tgwy.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tgwy.entity.User;
import com.tgwy.service.UserService;

@Controller
public class LoginController {

	@Inject
	private UserService userService;
	@RequestMapping("index")
	public String index(){
		List<User> users = userService.listAll(new User());
		for(User u : users){
			System.out.println(u);
		}
		return "index";
	}
	
	@RequestMapping("login")
	public String login(){
		
		return "login";
	}
}
