package com.fenghongzhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页controller
 * @author fhz
 *
 */
@Controller
public class IndexController {

	//返回首页
	@GetMapping("/index")
	public String getIndex(Model model) {
		return "index";
	}
	
}
