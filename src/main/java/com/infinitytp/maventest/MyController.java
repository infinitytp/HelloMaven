package com.infinitytp.maventest;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("song")
public class MyController {
	
	@RequestMapping("login")
	private String hello(
			@RequestParam(value="username",required=false) String username,
			@RequestParam(value="password",required=false) String password,
			ModelMap model) {
		model.addAttribute("message","Say hello to world!");
		return "hello";
	}
	
	@RequestMapping("login1")
	private String hello2(HttpServletRequest request,ModelMap model) {
		String string = request.getRemoteAddr();
		model.addAttribute("song", "Song say hello to world" + string);
		return "hello1";
	}
	
	
	@ModelAttribute("hello")
	public String getHello() {
		System.out.println("-------------Hello---------");
		return "world";
	}
	
	@ModelAttribute("user2")
	public User getUser() {
		System. out .println( "---------getUser-------------" );
		User user = new User();
		user.setUserName("user2");
		return user;
	}
	
	@ModelAttribute("intValue")
	public int getInt() {
		System. out .println( "-------------intValue---------------" );
		return 10;
	}
	
	@RequestMapping(value = "/sayhello", method = RequestMethod.GET)
	public void sayHello(@ModelAttribute("hello") String h, @ModelAttribute("intValue") int num,
			@ModelAttribute("user2") User user, Writer writer) {
		try {
			writer.write( "Hello " + h + " , Hello " + user.getUserName() + num);
			writer.write( "\r" );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
}
