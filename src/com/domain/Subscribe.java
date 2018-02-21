package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscribe")
public class Subscribe {
	
	
	private int subscribeid;
	private String name;
	private String emailid;
	
	@Id
	@GeneratedValue
	@Column(name = "subscribeid")
	public int getSubscribeid() {
		return subscribeid;
	}
	public void setSubscribeid(int subscribeid) {
		this.subscribeid = subscribeid;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="emailid")
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	

}
