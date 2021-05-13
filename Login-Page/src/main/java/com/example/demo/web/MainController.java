package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	@GetMapping("/adminpage")
	public String adminpage() {
		return "admin_page";
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}