package com.liyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class LoginController {

	@RequestMapping("/login")
	public String login(@RequestParam(name="username",required=true) String userName, @RequestParam(value="password",defaultValue="abc") String pwd,
			Model model) {
        System.out.println("login登录,username:"+userName +" ,password:"+pwd);
		if (userName.equals("admin") && pwd.equals("admin")) {
			model.addAttribute("username", userName);
			return "success";
		} else {
			model.addAttribute("username", userName);
			return "error";
		}
	}
}
