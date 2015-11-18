package controller;

import javax.servlet.http.HttpServletRequest;

import model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/list")
	public String list(){
		System.out.println("-------user list-----------");
		return "user_list";
	}
	
	@RequestMapping("/add")
	public String add(){
		System.out.println("-------add user success-----");
		return "user_add";
	}
	
	@RequestMapping("/update")
	public String update(){
		System.out.println("--------update user success-----");
		return "user_update";
	}
	
	@RequestMapping("/adduser")
	public String add_info(HttpServletRequest request){
		System.out.println("@@@@@@2");
		System.out.println(request.getParameter("account"));
		System.out.println(request.getParameter("password"));
		return "success";
	}
	
	@RequestMapping("/adduserbyparam")
	public String add_info_byparam(String account, String password){
		print("success");
		print(account);
		print(password);
		return "success";
	}
	
	@RequestMapping("/adduserbyobject")
	public String add_info_byobject(User user){
		print(user);
		return "success";
	}
	
	private void print(Object msg){
		System.out.println(msg);
	}
	
}
