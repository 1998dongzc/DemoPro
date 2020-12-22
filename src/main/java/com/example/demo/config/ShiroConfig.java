package com.example.demo.config;

import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {

    @Bean
    public SecurityManager securityManager(){
        DefaultSecurityManager defaultSecurityManager=new DefaultSecurityManager();
        return defaultSecurityManager;
    }

//    @Bean
//    public Realm realm(){
//    }

}
