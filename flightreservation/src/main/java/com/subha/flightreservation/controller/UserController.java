package com.subha.flightreservation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.subha.flightreservation.entities.User;
import com.subha.flightreservation.repos.UserRepository;
import com.subha.flightreservation.service.SecurityService;


@Controller
public class UserController {
	@Autowired
	UserRepository userRepo;
	@Autowired
	private BCryptPasswordEncoder encode;
	@Autowired
	private SecurityService securityService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/showRegistration")
	public String showRegistrationPage() {
		return "login/registerUser";
	}
	
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user) {
		LOGGER.info("Inside registerUser() to register : "+user);
		user.setPassword(encode.encode(user.getPassword()));
		userRepo.save(user);
		return "login/login";
	}
	
	@RequestMapping("/login")
	public String showLoginPage() {
		LOGGER.info("Inside showLoginPage() page");
		return "login/login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String finfFlights(@RequestParam("email") String email,@RequestParam("password") String password, ModelMap modelMap) {
		LOGGER.info("Inside finfFlights() page for mail id: "+email);
		boolean auth = securityService.login(email, password);
		if(auth) {
			return "findFlights";
		}else {
			modelMap.addAttribute("msg", "Invalid username or password , Please try again");
		}
		return "login/login";
	}

}
