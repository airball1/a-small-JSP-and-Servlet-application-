package com.in28minutes.login;

public class LoginService {
		
	public boolean isUserValid(String user, String password) {
		if (user.equals("in28minutes") && password.equals("dummy")) {
			return true;
		}
		return false;
	}
}
