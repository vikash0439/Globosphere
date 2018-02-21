package com.dao;


import com.Form.ContactForm;
import com.Form.OrderForm;
import com.Form.SubscribeForm;


public interface GlobosphereDao {
	public void addOrder(OrderForm orderform);
	public void addSubscribe(SubscribeForm subscribeform);
	public void addContact(ContactForm contactform);

}