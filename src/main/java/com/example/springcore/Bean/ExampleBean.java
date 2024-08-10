package com.example.springcore.Bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExampleBean {

    public ExampleBean(){
        log.info("Example Bean Created");
    }

    @PostConstruct
    public void init(){
        log.info("PostConstuct Example bean");
    }

    @PreDestroy
    public void destroy(){
        log.info("@PreDestroy Example Bean");
    }

    public String api(){
        log.info("API method from example bean");
        return "BeanAPI";
    }
    
}
