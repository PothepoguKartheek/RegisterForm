package com.Register.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Register.Entity.RegisterEntity;
import com.Register.Service.Repository.RegisterRepository;


@Service
public class RegisterServiceImpl {
	
	
	@Autowired
	private RegisterRepository registerRepository;
	
	public void processUserInfo(RegisterEntity entity)
	{
		registerRepository.saveUser(entity);
	}
	

}
