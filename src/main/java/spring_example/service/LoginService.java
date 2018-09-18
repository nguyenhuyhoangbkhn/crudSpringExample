package spring_example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_example.model.User;
import spring_example.repository.UserCmcRepository;

@Service
public class LoginService {
	@Autowired
	private UserCmcRepository ucr;
	
	public boolean login(User user) {
		return ucr.authenticate(user);
	}
}
