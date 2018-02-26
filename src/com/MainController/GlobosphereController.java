package com.MainController;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Form.ContactForm;
import com.Form.OrderForm;
import com.Form.SubscribeForm;
import com.mail.MailMail;
import com.services.impl.GlobosphereServiceImpl;


@Controller
public class GlobosphereController {
	
	
	 @Autowired
	 GlobosphereServiceImpl service;
	 
	// Html pages mapping 
	
	@RequestMapping(value="/home")
	public ModelAndView Home(Map model, SubscribeForm subscribeform){
		model.put("subscribeform", subscribeform);
		String message = "HELLO About";  
		return new ModelAndView("home", "message", message);
	}
	
	@RequestMapping("/about")
	public ModelAndView about(Map model, SubscribeForm subscribeform){
		model.put("subscribeform", subscribeform);
		String message = "HELLO About";  
		return new ModelAndView("about", "message", message);
	}
	
	@RequestMapping("/biometrics")
	public ModelAndView biometrics(Map model, SubscribeForm subscribeform){
		model.put("subscribeform", subscribeform);
		String message = "HELLO About";  
		return new ModelAndView("about", "message", message);
	}
	
	@RequestMapping("/contact")
	public ModelAndView Contact(Map model, ContactForm contactform, SubscribeForm subscribeform){
		model.put("contactform", contactform);
		model.put("subscribeform", subscribeform);
		String message = "HELLO About";  
		return new ModelAndView("contact", "message", message);
	}
	
	@RequestMapping("/dsc")
	public ModelAndView Dsc(Map model, OrderForm orderform, SubscribeForm subscribeform){
		model.put("orderform", orderform); 
		model.put("subscribeform", subscribeform);
		Map< String, String > product = new HashMap<String, String>();
        product.put("dscclass2sign", "DSC Class 2 Sign");
        product.put("dscclass2sign&encrypt", "DSC Class 2 Sign & Encrypt");
        product.put("dscclass3sign", "DSC Class 3 Sign");
        product.put("dscclass3sign&encrypt", "DSC Class 3 Sign & Encrypt");
        product.put("dgft", "DGFT");
		return new ModelAndView("dsc", "product", product);
	}
	
	@RequestMapping("/epass-2003")
	public ModelAndView epass(Map model, OrderForm orderform, SubscribeForm subscribeform){
		model.put("orderform", orderform); 
		model.put("subscribeform", subscribeform);
		Map< String, String > product = new HashMap<String, String>();
        product.put("ePass2003Auto", "ePass 2003 Auto");
        product.put("dscwithepass","DSC with ePass");
		return new ModelAndView("epass-2003", "product", product);
	}
	
	@RequestMapping("/gallery")
	public ModelAndView gallery(Map model, SubscribeForm subscribeform){
		model.put("subscribeform", subscribeform);
		String message = "HELLO About";  
		return new ModelAndView("gallery", "message", message);
	}
	
	@RequestMapping("/gemalto-safenet")
	public ModelAndView gemalto(Map model, OrderForm orderform, SubscribeForm subscribeform){
		model.put("orderform", orderform); 
		model.put("subscribeform", subscribeform);
		Map< String, String > product = new HashMap<String, String>();
        product.put("safenet", "SafeNet");
        product.put("dsc with safenet", "DSC with SafeNet");
		return new ModelAndView("gemalto-safenet", "product", product);
	}
	
	@RequestMapping("/page-not-found")
	public ModelAndView error(Map model, SubscribeForm subscribeform){
		model.put("subscribeform", subscribeform);
		String message = "HELLO About";  
		return new ModelAndView("page-not-found", "message", message);
	}
	
	@RequestMapping("/proxkey")
	public ModelAndView proxkey(Map model, OrderForm orderform, SubscribeForm subscribeform){
		model.put("orderform", orderform);
		model.put("subscribeform", subscribeform);
		Map< String, String > product = new HashMap<String, String>();
        product.put("Proxkey", "WatchData Proxkey");
        product.put("dscwithproxkey", "DSC with Proxkey");  
		return new ModelAndView("proxkey", "product", product);
	}
	
	@RequestMapping("/solutions")
	public ModelAndView solutions(Map model, SubscribeForm subscribeform){
		model.put("subscribeform", subscribeform);
		String message = "HELLO About";  
		return new ModelAndView("solutions", "message", message);
	}
	
	@RequestMapping("/support")
	public ModelAndView support(Map model, SubscribeForm subscribeform){
		model.put("subscribeform", subscribeform);
		String message = "HELLO About";  
		return new ModelAndView("support", "message", message);
	}
	
	@RequestMapping("/team")
	public ModelAndView team(Map model, SubscribeForm subscribeform){
		model.put("subscribeform", subscribeform);
		String message = "HELLO About";  
		return new ModelAndView("team", "message", message);
	}
		
	// Form mapping
	
	@RequestMapping("/subscribe")
	public ModelAndView subscription(Map model, @Valid SubscribeForm subscribeform, BindingResult result, @RequestParam String emailid, @RequestParam String name){
		String message = "You have been subscribed with us. Regular updates will be dropped in your mail"; 
		service.addSubscribe(subscribeform);
		System.out.println("From the subscription");
		try{
			System.out.println("Email check: "+emailid);
			MailMail.subscribe(emailid, name);
			System.out.println("Mail sent");
			}catch(Exception e){
				System.out.println("Mail not send: "+e);
			}
		return new ModelAndView("thanks", "message", message);
	}
	@RequestMapping("/contactus")
	public ModelAndView contactus(Map model, @Valid ContactForm contactform, BindingResult result, @RequestParam String emailid, @RequestParam String name){
		String message = "One of our team will soon contact you. Stay tuned!"; 
		service.addContact(contactform);
		System.out.println("From the subscription");
		try{
			System.out.println("Email check: "+emailid);
			MailMail.sendContact(emailid, name);
			System.out.println("Mail sent");
			}catch(Exception e){
				System.out.println("Mail not send: "+e);
			}
		return new ModelAndView("thanks", "message", message);
	}
	
	@RequestMapping("/order")
	public ModelAndView order(Map model, @Valid OrderForm orderform, BindingResult result, @RequestParam String product, @RequestParam String name, @RequestParam String emailid, @RequestParam String mobile, @RequestParam String message){
		String m = "Your enquiry is sent to the authorised team. Our team will contact you soon."; 
		service.addOrder(orderform);
		System.out.println("From the Controller");
		try{
			System.out.println("Email check: "+emailid);
			MailMail.order(emailid, name);
			MailMail.order(product, name, emailid, mobile, message);
			System.out.println("Mail sent");
			}catch(Exception e){
				System.out.println("Mail not send: "+e);
			}
		return new ModelAndView("thanks", "message", m);
	}
}
