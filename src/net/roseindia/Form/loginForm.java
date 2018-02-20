package net.roseindia.Form;

import org.hibernate.validator.constraints.NotEmpty;

public class loginForm {
	
	@NotEmpty(message="Please enter username")
	private String username;
	
	@NotEmpty(message="Enter password to login")
	private String password;

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
