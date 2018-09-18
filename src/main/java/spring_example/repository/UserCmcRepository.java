package spring_example.repository;

import org.springframework.stereotype.Repository;

import spring_example.model.User;


@Repository
public class UserCmcRepository {
	public boolean authenticate(User user) {
		if (user.getName().equals(user.getPassword()))
			return false;
		return true;
	}
}
