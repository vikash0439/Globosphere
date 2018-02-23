package com.services.impl;

import java.util.List;



import com.Form.ContactForm;
import com.Form.OrderForm;
import com.Form.SubscribeForm;
import com.dao.daoImpl.GlobosphereDaoImpl;
import com.services.GlobosphereService;



public class GlobosphereServiceImpl implements GlobosphereService {
	
	GlobosphereDaoImpl globosphereDao;

	public void setGlobosphereDao(GlobosphereDaoImpl globosphereDao) {
		this.globosphereDao = globosphereDao;
	}

	@Override
	public void addSubscribe(SubscribeForm subscribeform) {
		// TODO Auto-generated method stub
		System.out.println("Sevice Implementation");
		globosphereDao.addSubscribe(subscribeform);
	}



	@Override
	public void addContact(ContactForm contactform) {
		// TODO Auto-generated method stub
		globosphereDao.addContact(contactform);
	}



	@Override
	public void addOrder(OrderForm orderform) {
		// TODO Auto-generated method stub
		globosphereDao.addOrder(orderform);
	}

	
}