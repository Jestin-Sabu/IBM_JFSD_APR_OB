package com.ibm.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping (value = "login")
	public String validate(@RequestParam String username, @RequestParam String password) {
		if(username.equals("Jestin") && password.equals("123")) {
			return "<h1>Login Successful</h1>";
		}
		else {
			return "<h1>Login Failed</h1>";
		}
	}
}
