package com.infinitytp.maventest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping(value="/student",method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student","command",new Student());
	}
	
	
	@RequestMapping(value="/addStudent", method = RequestMethod.POST)
	@ExceptionHandler({SpringException.class})
	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model, HttpServletRequest request) {
		if (student.getName().length()<3) {
			throw new SpringException("Given name is too short!");
		} else {
			model.addAttribute("name", student.getName());
		}
		
		String age = request.getParameter("age");
		System.out.println(age);
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		
		return "result";
	}
}
