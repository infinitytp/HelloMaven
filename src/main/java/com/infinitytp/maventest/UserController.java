package com.infinitytp.maventest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("register", "command", new User());
	}
	
	@RequestMapping(value = "sysout", method = RequestMethod.POST)
	public void sysout(@ModelAttribute("SpringWeb") User user) {
		System.out.println(user.getUserName());
	}
	
}
