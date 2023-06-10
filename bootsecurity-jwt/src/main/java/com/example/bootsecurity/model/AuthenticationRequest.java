package com.example.bootsecurity.model;

public class AuthenticationRequest {



private String username;
private String password;

public AuthenticationRequest() {
	// TODO Auto-generated constructor stub
}

public AuthenticationRequest(String username, String password) {
	super();
	this.username = username;
	this.password = password;
	System.out.println("authRequest called..............");
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

}