package com.yash.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yash.springboot.service.UserService;

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/hello")
	public String hello(Model model) {
		return "hello";
		
	}
	
	@GetMapping(value = "/list")
	public ResponseEntity userDetails() { 
		List userDetails = userService.getUserDetails();
		return new ResponseEntity(userDetails, HttpStatus.OK);
	}
}
