package com.tgwy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tg.wy.MybatisUtils;
import com.tgwy.entity.User;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String main(@RequestParam(value="loginUserName")String loginUserName,@RequestParam(value="loginUserPass")String loginUserPass) {
		User user = MybatisUtils.getUser();
		
		System.out.println(user.getNickname()+"---"+user.getPassword());
		System.out.println(loginUserName+"---"+loginUserPass);
		return "main";
	}
}
