package com.web.ssm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.web.ssm.pojo.User;
import com.web.ssm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView user(@PathVariable("id") Long id, ModelMap model){
		User user = userService.getUserById(id);
		model.put("user", user);
		return new ModelAndView("user");
	}
}
