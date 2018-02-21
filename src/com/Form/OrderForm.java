package com.Form;

import javax.validation.constraints.NotNull;


public class OrderForm {
	private int orderid;
	private String product;
	private String name;
	@NotNull(message = "Phone no required")
	private long mobile;
	@NotNull(message = "Emailid cant be null")
	private String emailid;
	@NotNull(message = "Please Specify Message")
	private String message;
	
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
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