package com.Register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Register.Dto.RegisterDto;
import com.Register.Entity.RegisterEntity;
import com.Register.Service.Impl.RegisterServiceImpl;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterServiceImpl impl;
	
	
	@RequestMapping("/saveUserDetails")
	public ModelAndView saveUserDetails(RegisterEntity dto)
	{
		System.out.println(dto);
		impl.processUserInfo(dto);
		return new ModelAndView("index.jsp");
	}

}
