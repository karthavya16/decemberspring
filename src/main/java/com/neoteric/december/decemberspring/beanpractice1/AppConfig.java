package com.neoteric.december.decemberspring.beanpractice1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.neoteric.december.decemberspring.beanpractice1")
public class AppConfig {

@Bean
    public MyService myService(){
    return new MyService();
}
@Bean
    public MyRepository myRepository(){
    return new MyRepository();
}
}
