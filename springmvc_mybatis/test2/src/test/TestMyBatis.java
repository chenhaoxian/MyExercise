package test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import bean.Users;
import mapper.UsersMapper;

@ContextConfiguration("/test_MyBatis.xml")
public class TestMyBatis {
	
	public static void main(String[] args) {
		
	}
	
	private static void print(Object msg){
		System.out.println(msg);
	}
	
	

}
