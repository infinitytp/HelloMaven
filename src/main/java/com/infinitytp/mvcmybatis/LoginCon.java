package com.infinitytp.mvcmybatis;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginCon {
	
	private UserService userService;
	
	
	@RequestMapping(value = "loginCon", method = RequestMethod.POST)
	public ModelAndView handReq(@RequestParam("userName") String name,
								@RequestParam("password") String password) {
		System.out.println("LoginCon");
		Map<String, Object> model = new HashMap<>();
		UserVO userVO = new UserVO();
		userVO.setName(name);
		userVO.setPassword(password);
		if (userService.selectUser(userVO) != null) {
			userVO = userService.selectUser(userVO);
			System.out.println("能查到信息");
			model.put("uservo", userVO);
			return new ModelAndView("WEB-INF/Main.jsp",model);
		} else {
			System.out.println("查不到信息");
			model.put("error", "用户名或密码错误");
			return new ModelAndView("WEB-INF/Login.jsp",model);
		}
		
	}

	
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
}
