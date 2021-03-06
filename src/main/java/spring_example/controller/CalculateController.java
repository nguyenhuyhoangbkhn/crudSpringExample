package spring_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring_example.model.User;
@Controller
public class CalculateController {

	@RequestMapping(value="calculate")
	public  String showLogin(Model model) {
		model.addAttribute("User",new User());
		int width = 0;
		int height = 0;
		int area = 0;
		int circuit = 0;
		model.addAttribute("width",width);
		model.addAttribute("height",height);
		model.addAttribute("area",area);
		model.addAttribute("circuit",circuit);
		return "calculate";
	}
	
	
	//redirect user update
	@RequestMapping("calcuteTrial")
	public String editUpdateById(Model model, @RequestParam("width") int width,
			@RequestParam("height") int height) {
		if ( height== 0 || width == 0) {
			return "redirect:calculate";
		} else {
			int area = height* width/2;
			int circuit = 2 * (height + width);
			model.addAttribute("area",area);
			model.addAttribute("circuit",circuit);
			return "calculate";
		}
	}
	
}
