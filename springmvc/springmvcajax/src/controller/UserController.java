package controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

	@RequestMapping("/ajaxCheckUser")
	public void checkUser(String username, HttpServletResponse response){
		print("--------------------");
		print(username);
		
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			if("chenhaoxian".equals(username)){
				out.println("you can!");
			}else {
				out.println("you not can!");
			}
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void print(Object msg){
		System.out.println(msg);
	}
	
}
