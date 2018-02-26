package com.dao;


import java.util.List;

import com.Form.ContactForm;
import com.Form.OrderForm;
import com.Form.SubscribeForm;
import com.domain.Order;


public interface GlobosphereDao {
	public void addOrder(OrderForm orderform);
	public void addSubscribe(SubscribeForm subscribeform);
	public void addContact(ContactForm contactform);
    public List<Order> getOrder();
}