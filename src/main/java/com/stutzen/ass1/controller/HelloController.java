package com.stutzen.ass1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/")
	public String welcomePage(){
		return "welcomePage";
	}

}
