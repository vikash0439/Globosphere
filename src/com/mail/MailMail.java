package com.mail;


import org.springframework.mail.*;
 
public class MailMail{
	
	private static MailSender mailSender;
 
	public void setMailSender(MailSender mailSender) {
		MailMail.mailSender = mailSender;
	}
		
	public static void sendContact(String emailid, String name){
		SimpleMailMessage message = new SimpleMailMessage(); 
		String subject="Thanks from Globosphere Technologies India Pvt Ltd";
		String from="noreply@globosphere.in";
		message.setFrom(from);
		message.setTo(emailid);
		message.setSubject(subject);
		message.setText("Hi "+name+"! Thank you for your contacting us through globosphere.in . A representative will contact you soon.");				
		mailSender.send(message);		
	}
	
	public static void subscribe(String email, String name){
		SimpleMailMessage message = new SimpleMailMessage(); 
		String subject="Thanks from Globosphere Technologies India Pvt Ltd";
		String from="noreply@globosphere.in";
		message.setFrom(from);
		message.setTo(email);
		message.setSubject(subject);
		message.setText("Hi "+name+"! Thank you for subscription on globosphere.in.  Regular mail will be dropped in your inbox.");				
		mailSender.send(message);		
	}
	
	public static void order(String email, String name){
		SimpleMailMessage message = new SimpleMailMessage(); 
		String subject="Thanks from Globosphere Technologies India Pvt Ltd";
		String from="noreply@globosphere.in";
		message.setFrom(from);
		message.setTo(email);
		message.setSubject(subject);
		message.setText("Hi "+name+"! Your enquiry is send to the team.  They will contact you soon. Or you can also on 01127672681 to know the status of your enquiry.");				
		mailSender.send(message);		
	}
	
	public static void order(String product, String name, String emailid, String phone, String m){
		SimpleMailMessage message = new SimpleMailMessage(); 
		String subject="New order recieved on the website ";
		String from="noreply@globosphere.in";
		message.setFrom(from);
		message.setTo("vikash0439@gmail.com");
		message.setSubject(subject);
		message.setText("New Order detail: Product: " +product+ "   Name: "+name+ "   Phone no: "+phone+ "  Email ID: "+emailid+ "  Message: "+m);
		mailSender.send(message);		
	}
}