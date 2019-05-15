package com.javasampleapproach.springrest.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class LoginPojo 
{
	 @Id
	  private String fullname;
	  private String email;
	  private String password;
	  private String repeatpassword;
	public LoginPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginPojo(String fullname, String email, String password, String repeatpassword) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.repeatpassword = repeatpassword;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	public String getRepeatpassword() {
		return repeatpassword;
	}
	public void setRepeatpassword(String repeatpassword) {
		this.repeatpassword = repeatpassword;
	}
	@Override
	public String toString() {
		return "LoginPojo [fullname=" + fullname + ", email=" + email + ", password=" + password + ", repeatpassword="
				+ repeatpassword + "]";
	}
	  	
	
}
