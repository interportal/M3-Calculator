package md.curs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import md.curs.model.User;
import md.curs.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		
		return userRepository.insertUser(user);
	}
	
	public List<User> getUsers() {
		
		return userRepository.userList();
	}
	
}
