package com.example.hms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

		
		@GetMapping("/")
		public String home()
		{
			return "Welcome to Hospital Management System";
		}
		
		@GetMapping("/about")
		public String about()
		{
			return "This is About Page";
		}
		
		@GetMapping("/contact")
		public String contact()
		{
			return "This is Contact Page";
		}
		
		@GetMapping("/login")
		public String login()
		{
			return "This is Login Page";
		}

}
