package com.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Form.ContactForm;
import com.Form.OrderForm;
import com.Form.SubscribeForm;
import com.dao.daoImpl.GlobosphereDaoImpl;
import com.services.GlobosphereService;



public class GlobosphereServiceImpl implements GlobosphereService {
	
	GlobosphereDaoImpl Dao;

	public void setGlobosphereDao(GlobosphereDaoImpl Dao) {
		this.Dao = Dao;
	}

	@Override
	public void addSubscribe(SubscribeForm subscribeform) {
		// TODO Auto-generated method stub
		Dao.addSubscribe(subscribeform);
	}



	@Override
	public void addContact(ContactForm contactform) {
		// TODO Auto-generated method stub
		Dao.addContact(contactform);
	}



	@Override
	public void addOrder(OrderForm orderform) {
		// TODO Auto-generated method stub
		Dao.addOrder(orderform);
	}

	
}