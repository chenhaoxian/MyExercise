package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping("/userLogin")
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login(String username, String password){
		print("success");
		print("=======");
		print(username+"@@@@@@@@@@");
		print(password);
		ModelAndView mad = new ModelAndView("/view/success.jsp");
		
		return mad;
	}
	
	@RequestMapping("/login2")
	public String login2(String username, String password){
		print("success");
		print("=======");
		print(username+"@@@@@@@@@@");
		print(password);
		
		return "success";
	}
	
	
	private void print(Object msg){
		System.out.println(msg);
	}
}
