package com.example.demo.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(
//		origins = "*", 
//		maxAge = 3600,
//		allowedHeaders={
//				"Authorization",
//				"X-PINGOTHER", 
//				"Origin", 
//				"X-Requested-With", "Content-Type", 
//				"Accept"})
public class AuthenticationController {

	@RequestMapping("/api/user")
	public Principal user(Principal user) {
		return user;
	}
	
}
