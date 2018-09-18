package spring_example.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring_example.dao.UserJdbcDao;
import spring_example.model.User;

@Controller
public class UserController {
	private ApplicationContext context;
	UserJdbcDao userDao;
	
	public UserController() {
		super();
		context = new ClassPathXmlApplicationContext("context.xml");
		userDao = context.getBean("userJdbcDao",UserJdbcDao.class);
	}
	
	@RequestMapping(value="register")
	public  String showLogin(Model model) {
		model.addAttribute("User",new User());
		return "register";
	}
	
	//add user if id = null 
	// update user if !id
	@RequestMapping(value="addUser")
	public  String login(@ModelAttribute("User") User user,Model model) {
		if(user.getId() != 0) {
			userDao.updateUser(user);
		} else {
			userDao.insertUser(user);
		}
		return "redirect:listAllUser";
	}
	
	@RequestMapping(value="listAllUser")
	public String listUser(Model model) {
		List<User> listUser = userDao.getAllUser();
//		System.out.println(x);
		model.addAttribute("listUser", listUser);
		return "listAllUser";
	}

	//redirect user update
	@RequestMapping("updateUser")
	public String editUpdateById(Model model, @RequestParam("userID") int id) {
		System.out.println(id);
		User user = userDao.findUserByID(id);
		model.addAttribute("User",user);
		return "register";
	}
	
	
	//delete user
	@RequestMapping("deleteUser")
	public String editUserById(Model model, @RequestParam("userID") int id) {
		System.out.println(id);
		userDao.delettUserByID(id);
		return "redirect:listAllUser";
	}
	
}
