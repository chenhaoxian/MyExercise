package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/addUser")
	public ModelAndView add(String username ,String password){
		print(username + "\n" + password);
		
		ModelAndView mav = new ModelAndView("success1");
		
		mav.addObject("username" , username);
		
		return mav;
	}
	
	private void print(Object msg){
		System.out.println(msg);
	}
}
