package com.luv2code.spring.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloGuru{
	
	@RequestMapping(method=RequestMethod.GET)
	public String getMessage(ModelMap model){
		model.addAttribute("welcomeMessage","Hello Suresh");
		return "home";
	} 

}
//http://localhost:8080/SpringDemoMVC/hello/getMessage
