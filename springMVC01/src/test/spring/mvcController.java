package test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/mvc")
public class mvcController {
	
	@RequestMapping("/hello")
	public String hello(){
		//print("aaaaaaaaa");
		return "hello";
	}
	
	private void print(Object msg){
		System.out.println(msg);
	}

}
