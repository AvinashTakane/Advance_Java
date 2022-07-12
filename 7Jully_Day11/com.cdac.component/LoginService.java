package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("log")
public class LoginService {

	public boolean isValidUser(String username, String password) {
		if(username.equals("avinash") && password.equals("123"))
			return true;
		return false;
	}
}
