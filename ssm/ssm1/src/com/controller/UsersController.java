package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Users;
import com.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/getAllUsers")
	public String getAllUsers(HttpServletRequest request){
		List<Users> allUsersList = usersService.findAll();
		
		request.setAttribute("usersList", allUsersList);
		return "/allUsers";
	}
	
	

}
