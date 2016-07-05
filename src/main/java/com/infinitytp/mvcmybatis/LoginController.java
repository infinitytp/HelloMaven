package com.infinitytp.mvcmybatis;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class LoginController implements Controller {
	private UserService userService;
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String name=request.getParameter("userName");
		String password=request.getParameter("password");
		//System.out.println("name-----"+name+"----password-----"+password);
		UserVO uservo=new UserVO();
		uservo.setName(name);
		uservo.setPassword(password);
		Map<String, Object> model=new HashMap<String, Object>();
		if(userService.selectUser(uservo)!=null){
			uservo=userService.selectUser(uservo);
			System.out.println("能查到信息");
			model.put("uservo", uservo);
			return new ModelAndView("WEB-INF/Main.jsp",model);
		}else{
			System.out.println("查不到信息");
			model.put("error", "用户名或密码错误");
			return new ModelAndView("WEB-INF/Login.jsp",model);
		}
		
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public UserService getUserService() {
		return userService;
	}

}

