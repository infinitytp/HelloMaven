package com.infinitytp.maventest;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	static Logger logger = Logger.getLogger(MainApp.class.getName());
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		logger.info("Going to create hellolog obj");
		HelloLog obj = (HelloLog) context.getBean("hellolog");
		obj.getMessage();
		logger.info("Exiting the program!");
	}
	
}
