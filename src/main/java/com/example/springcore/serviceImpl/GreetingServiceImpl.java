package com.example.springcore.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springcore.Bean.ProtypeScopeBean;
import com.example.springcore.service.GreetingService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GreetingServiceImpl implements GreetingService{

	@Autowired
	ProtypeScopeBean protoBean;
	
	public GreetingServiceImpl()
	{
		log.info("GreetingServiceImpl created");
	}
	
	@Override
	public String greet() {
		//this.protoBean.toString();
		return this.protoBean.toString()+"Hello from Spring GrettingService ref-> "+ this;
	}

}