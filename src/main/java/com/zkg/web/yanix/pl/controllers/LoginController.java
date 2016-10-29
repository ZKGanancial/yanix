package com.zkg.web.yanix.pl.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zkg.web.yanix.bl.models.UserAccount;
import com.zkg.web.yanix.bl.services.UserAdministrationService;

@Controller
public class LoginController {
	
	@Autowired
	private UserAdministrationService service;
	
	// Login form
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("userAccount", new UserAccount());		
	    return "login";
	}
	
	@RequestMapping(value = "/loginResult", method = RequestMethod.POST)
	public String loginPost(UserAccount userAccount, HttpSession session, Model model) {
		UserAccount dbUser = service.getUserAccount(userAccount.getUserName());
		if (dbUser != null && dbUser.getPassWord().equals(userAccount.getPassWord())) {
			session.setAttribute("loggedInUser",dbUser.getFirstName()+" "+dbUser.getLastName());
			return "redirect:/home";
		}
		else {
			model.addAttribute("message", "Invalid credentials!");
			return "login";
		}
	}
}
