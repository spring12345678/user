package com.user.model;

public class User {

	private String user_id;

	private String email;

	private String password;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String id) {
		this.user_id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return ("User id= " + user_id + "email=" + email + "password=" + password);

	}
}
