package spring_example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring_example.model.User;
//import spring_example.service.UserCMCService;
import spring_example.service.LoginService;

@SuppressWarnings("unused")
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	
	
//	@RequestMapping(value="listUser")
//	public  String login(@ModelAttribute("User") User user,Model model) {
//		
//		if(loginService.login(user)) {
//			model.addAttribute("User",user);
//			return "listUser";
//		}
//		model.addAttribute("error",true);
//		return "redirect:login";
//	}
}
