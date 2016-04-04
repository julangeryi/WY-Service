package com.tgwy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String main(@RequestParam(value="loginUserName")String loginUserName,@RequestParam(value="loginUserPass")String loginUserPass) {
		System.out.println(loginUserPass);
		return "main";
	}
}
