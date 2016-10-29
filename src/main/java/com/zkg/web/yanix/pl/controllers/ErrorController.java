package com.zkg.web.yanix.pl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {
	
	@RequestMapping("/error404")
	public String display404() {
		return "error404";
	}
	
	@RequestMapping("/error500")
	public String display500() {
		return "error500";
	}

}
