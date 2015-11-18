package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/list")
	public String list(){
		System.out.println("-----查询用户信息-------");
		return "user_list";
	}
	
	@RequestMapping("/add")
	public String add(){
		System.out.println("-------添加用户--------");
		return "user_add";
	}
	
	@RequestMapping("/update")
	public String update(){
		System.out.println("------更新用户-----------");
		return "user_update";
	}

}
