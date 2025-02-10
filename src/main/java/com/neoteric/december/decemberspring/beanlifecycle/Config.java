package com.neoteric.december.decemberspring.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Scope("singleton")
    public BeanClass beanClass(){
        return new BeanClass();
    }
}
