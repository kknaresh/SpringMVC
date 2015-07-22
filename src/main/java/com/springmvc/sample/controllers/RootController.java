package com.springmvc.sample.controllers;

import javax.annotation.Resource;
import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.sample.mail.MailSender;
import com.springmvc.sample.mail.MockMailSender;

@Controller
public class RootController {
	
	private MailSender mailSender;
	
	@Autowired
	public RootController(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
//	@RequestMapping("/")
//	public String home() throws MessagingException {
//		
//		//mailSender.send("abc@example.com", "Hello, World", "Mail from spring");		
//		return "home";
//		
//	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("name","Naresh");
		
		return "signup"; //View Name
		
	}
	
	

}
