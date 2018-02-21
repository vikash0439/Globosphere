package com.Form;

import javax.validation.constraints.NotNull;


public class ContactForm {
	
	private int contactid;
	@NotNull(message = "Please Specify Name")
	private String name;
	@NotNull(message = "Phone no required")
	private long mobile;
	@NotNull(message = "Emailid cant be null")
	private String emailid;
	@NotNull(message = "Please Specify Message")
	private String message;
	
	
	public int getContactid() {
		return contactid;
	}
	public void setContactid(int contactid) {
		this.contactid = contactid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
