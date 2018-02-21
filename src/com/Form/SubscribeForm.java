package com.Form;

import javax.validation.constraints.NotNull;

public class SubscribeForm {
	
	private int subscribeid;
	@NotNull(message = "Please Specify Name")
	private String name;
	@NotNull(message = "Please enter Emailid")
	private String emailid;
	
	public int getSubscribeid() {
		return subscribeid;
	}
	public void setSubscribeid(int subscribeid) {
		this.subscribeid = subscribeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}
