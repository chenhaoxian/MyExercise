package test.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
	@RequestMapping(value="/hello.do")
	public String hello(String username,Model model){
		print(username);
		model.addAttribute("helloworld","Hello:"+username);
		return "index";
	}
	
	private void print(Object msg){
		System.out.println(msg);
	}
}
