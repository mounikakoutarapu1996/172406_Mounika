package com.sts.Register.RegisterDemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="register")
public class Register {
 
	@Id
	 private String Fullname;
	 private String Email;
	 private String password;
	 private String repeatpassword;
	 
	public Register(String fullname, String email, String password, String repeatpassword) {
		super();
		Fullname = fullname;
		Email = email;
		this.password = password;
		this.repeatpassword = repeatpassword;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepeatpassword() {
		return repeatpassword;
	}
	public void setRepeatpassword(String repeatpassword) {
		this.repeatpassword = repeatpassword;
	}
	@Override
	public String toString() {
		return "Register [Fullname=" + Fullname + ", Email=" + Email + ", password=" + password + ", repeatpassword="
				+ repeatpassword + "]";
	}
}
	
	