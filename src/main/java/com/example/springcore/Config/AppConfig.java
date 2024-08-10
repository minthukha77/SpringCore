package com.example.springcore.Config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.springcore.Bean.ExampleBean;
import com.example.springcore.Bean.HelloMessageGenerator;
import com.example.springcore.Bean.ProtypeScopeBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Bean
    public ExampleBean exmapleBean(){
        log.info("Invoke a factory method");
        return new ExampleBean();
    }

    @Bean(name = "prototypeBean")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public ProtypeScopeBean createPrototype(){
        log.info("Create Prototype Bean");
        return new ProtypeScopeBean();
    }

    @Bean
    @RequestScope
    public HelloMessageGenerator requestScopedBean(){
        log.info("HelloMessageBean Created");
        return new HelloMessageGenerator();
    }
    
}
