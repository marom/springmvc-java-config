package springmvc.java.service;

import springmvc.java.domain.User;

import java.util.List;

public interface UserService {
	
	User findUserById(long id);
	User findUserWithBlogPostsByUsername(String username);
	List<User> findAllUsers();

}
