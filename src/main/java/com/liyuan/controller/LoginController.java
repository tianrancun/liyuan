package com.liyuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.liyuan.model.UserVO;
import com.liyuan.service.UserService;

@Controller 
public class LoginController {

    @Autowired
    private UserService userService;
    
	@RequestMapping("/login")
	public String login(@RequestParam(name="username",required=true) String userName, @RequestParam(value="password",defaultValue="abc") String pwd,
			Model model) {
        System.out.println("login登录,username:"+userName +" ,password:"+pwd);
        UserVO userVO=userService.findByUserNameAndPwd (userName, pwd);
		if (null!=userVO) {
			model.addAttribute("username", userName);
			return "success";
		} else {
			model.addAttribute("username", userName);
			return "error";
		}
	}
}
