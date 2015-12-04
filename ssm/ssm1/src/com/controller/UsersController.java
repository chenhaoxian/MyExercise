package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Users;
import com.service.UsersService;



@Controller
@RequestMapping("/users")
public class UsersController {
	private UsersService usersService;
	
	@RequestMapping("/getAllUsers")
	public String getAllUsers(HttpServletRequest request){
		List<Users> allUsersList = usersService.findAll();
		if(allUsersList != null) 
			print(allUsersList.toString());
		request.setAttribute("usersList", allUsersList);
		return "/allusers";
	}
	
	
	@RequestMapping("/findUser")
	public String findUserByUsername(HttpServletRequest request){
		print("@@@@@@@@@@@@@@@@@@");
		int id = Integer.parseInt(request.getParameter("id"));
		print(id);
		Users user = usersService.findUserByUserName(id);
		if(user != null){
			user.toString();
		}else{
			print("@@@@@@@@@@@@@");
		}
//		print(user.toString());
		request.setAttribute("user", user);
		return "/user";
		
	}
	
	
	
	private void print(Object msg){
		System.out.println(msg);
		
	}

	public UsersService getUsersService() {
		return usersService;
	}

	@Autowired
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	
	
	
	

}
