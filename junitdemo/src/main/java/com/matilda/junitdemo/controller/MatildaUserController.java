package com.matilda.junitdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.matilda.junitdemo.model.MatildaUser;
import com.matilda.junitdemo.service.MatildaUserService;

@Controller
public class MatildaUserController {
	
	@Autowired
	MatildaUserService userService;
	
	@GetMapping("/loaddUsers")
	public List<MatildaUser> loadUsers() {
		
		return userService.getUsersList();
	}

}
