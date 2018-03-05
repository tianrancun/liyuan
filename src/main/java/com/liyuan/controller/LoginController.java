package com.liyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class LoginController {

	@RequestMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
        System.out.println("login登录");
		if (username.equals("admin") && password.equals("admin")) {
			model.addAttribute("username", username);
			return "success";
		} else {
			model.addAttribute("username", username);
			return "error";
		}
	}
}
