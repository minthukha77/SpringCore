package com.example.springcore.Bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProtypeScopeBean {
    public ProtypeScopeBean(){
        log.info("Prototypescope bean created => " + this);
    }
}
