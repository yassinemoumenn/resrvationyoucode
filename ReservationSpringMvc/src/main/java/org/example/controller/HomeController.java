package org.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.example.model.Users;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@Autowired

@Qualifier("UserService")
	private UserService userService;

	Users user;

	@RequestMapping(value="/")
	public ModelAndView login(HttpServletResponse response) throws IOException{
		return new ModelAndView("accuill");
	}


     @RequestMapping(value = "/register", method = RequestMethod.GET)
	   public String register() {
	      return "register";
	  }
     @RequestMapping(value = "/login", method = RequestMethod.GET)
	   public String login() {
	      return "login";
	  }
     
     @RequestMapping(value = "/reservation", method = RequestMethod.GET)
	   public String reservation() {
	      return "reservation";
	  }
     @RequestMapping(value = "/accuill", method = RequestMethod.GET)
	   public String accuill() {
	      return "reservation";
	  }
   
   
     
 	@RequestMapping(value="/login")
 	public String login(Model model) throws IOException{
		model.addAttribute("user", user);
 		return "login";
	}
 	
    
	@RequestMapping(value="/reservationlist")
	public String reservationlist(Model model) throws IOException{
		model.addAttribute("user", user);
		return "reservationlist";
	}

   
  
}
