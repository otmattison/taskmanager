package com.hcl.taskmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.hcl.taskmanager.model.User;
import com.hcl.taskmanager.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
    public String signUpPage() {
        return "register";
    }

	@RequestMapping(value = "/register", method = RequestMethod.POST)
    public RedirectView postSignUpPage(User user) {
        service.addUser(user);
        return new RedirectView("display-tasks");
    }

}
