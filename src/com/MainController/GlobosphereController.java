package com.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class GlobosphereController {
	
	@RequestMapping(value="/home")
	public ModelAndView Home(){
		String message = "HELLO About";  
		return new ModelAndView("index", "message", message);
	}
	
	@RequestMapping("/about")
	public ModelAndView about(){
		String message = "HELLO About";  
		return new ModelAndView("about", "message", message);
	}
	
	@RequestMapping("/biometrics")
	public ModelAndView biometrics(){
		String message = "HELLO About";  
		return new ModelAndView("about", "message", message);
	}
	
	@RequestMapping("/contact")
	public ModelAndView Contact(){
		String message = "HELLO About";  
		return new ModelAndView("contact", "message", message);
	}
	
	@RequestMapping("/dsc")
	public ModelAndView Dsc(){
		String message = "HELLO About";  
		return new ModelAndView("dsc", "message", message);
	}
	
	@RequestMapping("/epass-2003")
	public ModelAndView epass(){
		String message = "HELLO About";  
		return new ModelAndView("epass-2003", "message", message);
	}
	
	@RequestMapping("/etoken")
	public ModelAndView etoken(){
		String message = "HELLO About";  
		return new ModelAndView("etoken", "message", message);
	}
	
	@RequestMapping("/gallery")
	public ModelAndView gallery(){
		String message = "HELLO About";  
		return new ModelAndView("gallery", "message", message);
	}
	
	@RequestMapping("/gemalto-safenet")
	public ModelAndView gemalto(){
		String message = "HELLO About";  
		return new ModelAndView("gemalto-safenet", "message", message);
	}
	
	@RequestMapping("/page-not-found")
	public ModelAndView error(){
		String message = "HELLO About";  
		return new ModelAndView("page-not-found", "message", message);
	}
	
	@RequestMapping("/proxkey")
	public ModelAndView proxkey(){
		String message = "HELLO About";  
		return new ModelAndView("proxkey", "message", message);
	}
	
	@RequestMapping("/solutions")
	public ModelAndView solutions(){
		String message = "HELLO About";  
		return new ModelAndView("solutions", "message", message);
	}
	
	@RequestMapping("/support")
	public ModelAndView support(){
		String message = "HELLO About";  
		return new ModelAndView("support", "message", message);
	}
	
	@RequestMapping("/team")
	public ModelAndView team(){
		String message = "HELLO About";  
		return new ModelAndView("team", "message", message);
	}

}
