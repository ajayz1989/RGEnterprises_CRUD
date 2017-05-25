package com.rg.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rg.entity.UserDetail;
import com.rg.service.OrderDetailsService;

@Controller
//@RequestMapping("/")
public class ODRequestController {

	@Autowired
	private OrderDetailsService orderDetailsService;
	private static final Logger LOGGER = LoggerFactory.getLogger(ODRequestController.class);
	
	@RequestMapping(value = { "/", "/login" })
	public String index() {
		return "login";
	}
	
	@RequestMapping(value="/getorders", method=RequestMethod.POST)
	public String orderDetails(@Valid UserDetail user, BindingResult bindingResult,Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("loginError", bindingResult.getFieldError());
			return "login";
		}
		LOGGER.info("Checking Login Credentials......");
		if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
			model.addAttribute("orders", orderDetailsService.findAll());
			LOGGER.info("Valid credentials");
			return "orders";
		}else{
			model.addAttribute("loginError", "Wrong username or password");
			LOGGER.info("InValid credentials");
			return "login";
		}
 	}
	
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public String orderDetails(Model model) {
		model.addAttribute("loginError", "Successfully logged out!!");
 		return "login";
 	}
	
}
