package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import bean.Users;

public interface UsersMapper {
	
	Users login(@Param(value="username") String name, @Param(value="password") String password);
	
	List<Users> getAllUsers();

}
