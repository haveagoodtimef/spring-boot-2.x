package com.fenghongzhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class Demo {
	
	@CrossOrigin
	@RequestMapping("/one")
	public void getDemo() {
		System.out.println("hehehe");
	}
	
	@ResponseBody
	public String getString() {
		
		return "";
	}
	
	

}
