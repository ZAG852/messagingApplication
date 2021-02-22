package com.revature.BootPractice.App.controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {
	//@Autowired
	//AuthenticationManager authenticationManager;
	@Autowired
	PasswordEncoder encoder;
	
	@GetMapping("/signup")
	public String signup() {
		//Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRe, authenticationManager))
		return "I login";
	}
	@PostMapping("/signout")
	public String SignOut() {
		return "I Logout";
	}
}
