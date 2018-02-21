
package com.services;


import com.Form.ContactForm;
import com.Form.OrderForm;
import com.Form.SubscribeForm;



public interface GlobosphereService{
	
	public void addSubscribe(SubscribeForm subscribeform);
	public void addContact(ContactForm contactform);
	public void addOrder(OrderForm orderform);
	
}