package com.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Form.ContactForm;
import com.Form.OrderForm;
import com.Form.SubscribeForm;
import com.dao.GlobosphereDao;
import com.domain.Contact;
import com.domain.Order;
import com.domain.Subscribe;

@Repository
public class GlobosphereDaoImpl implements GlobosphereDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void addOrder(OrderForm orderform) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setName(orderform.getName());
		order.setEmailid(orderform.getEmailid());
		order.setMobile(orderform.getMobile());
		order.setProduct(orderform.getProduct());
		order.setMessage(orderform.getMessage());;
		sessionFactory.openSession().saveOrUpdate(order);
		
	}


	public void addSubscribe(SubscribeForm subscribeform) {
		// TODO Auto-generated method stub
		Subscribe subscribe=new Subscribe();
		subscribe.setSubscribeid(subscribeform.getSubscribeid());
		subscribe.setName(subscribeform.getName());
		subscribe.setEmailid(subscribeform.getEmailid());
		System.out.println("Dao implementation");
		sessionFactory.openSession().saveOrUpdate(subscribe);
	}

	
	public void addContact(ContactForm contactform) {
		// TODO Auto-generated method stub
		Contact contact=new Contact();
		contact.setContactid(contactform.getContactid());
		contact.setName(contactform.getName());
		contact.setEmailid(contactform.getEmailid());
		contact.setMobile(contactform.getMobile());
		contact.setMessage(contactform.getMessage());
		sessionFactory.openSession().saveOrUpdate(contact);
	}

	
}