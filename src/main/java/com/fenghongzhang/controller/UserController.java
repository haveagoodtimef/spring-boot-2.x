package com.fenghongzhang.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fenghongzhang.entity.User;
import com.fenghongzhang.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("info","user/list");
		return "index";
	}
	
	@GetMapping("/user/list")
    public String userlist(Model model) {
        List<String> userList = new ArrayList<String>();
        userList.add("20170928");
        userList.add("123456");
        model.addAttribute("userList", userList);
        return "userList";
    }
	
	
	@GetMapping("/getAllUsers")
	public String getAllusers(Model model){
		List<User> allUsers = userService.getAllUsers();
		System.out.println(allUsers.size());
		
		for (User user : allUsers) {
			System.out.println(user);
		}
		model.addAttribute("info",allUsers.toString());
		return "index";
	}
}
