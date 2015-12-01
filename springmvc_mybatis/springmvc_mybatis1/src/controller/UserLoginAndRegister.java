package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/loginAndRegister")
public class UserLoginAndRegister {

	@RequestMapping("/userLogin")
	public ModelAndView login(String username , String password){
		print("Success!");
		ModelAndView mad = new ModelAndView("loginSuccess");
		return mad;
	}
	
	private void print(Object msg){
		System.out.println(msg);
	}
	
}
