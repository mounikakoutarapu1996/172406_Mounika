package com.jdbc.support;

public class Shopping {
	private String name;
	private String email;
	private String password;
	private long phone;
	public Shopping(String name, String email, String password, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	
	public Shopping() {
		// TODO Auto-generated constructor stub
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public long getphone() {
		return phone;
	}
	public void setphone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Shopping [name=" + name + ", email=" + email + ", password=" + password + ", phone=" + phone + "]";
	}
	

}
