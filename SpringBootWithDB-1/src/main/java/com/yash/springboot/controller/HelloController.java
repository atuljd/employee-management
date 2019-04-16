package com.yash.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping(value="/hello")
	public String hitFirst(Model model) {
		return "hello";
	}

}
