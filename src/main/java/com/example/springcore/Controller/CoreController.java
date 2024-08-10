package com.example.springcore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcore.Bean.ExampleBean;
import com.example.springcore.Bean.HelloMessageGenerator;
import com.example.springcore.Bean.ProtypeScopeBean;
import com.example.springcore.service.GreetingService;

import jakarta.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/core")
public class CoreController {

    @Autowired
    ExampleBean exampleBean2;

    @Autowired
    GreetingService greetingService;

    @Resource( name = "requestScopedBean")
    HelloMessageGenerator requestScopedBean;

    @GetMapping("/bean-test")
    String beanTest() {
        return this.exampleBean2.api();
    }
    @GetMapping("/request")
    String requestScopeBean() {
        return this.requestScopedBean.getMessage();
    }


    
    
}
