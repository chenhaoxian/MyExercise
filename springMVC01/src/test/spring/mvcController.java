package test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller 负责注册一个bean 到spring 上下文中
//@RequestMapping 注解为控制器指定可以处理哪些 URL 请求
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
