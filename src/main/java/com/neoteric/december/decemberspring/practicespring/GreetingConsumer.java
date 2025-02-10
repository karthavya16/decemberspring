package com.neoteric.december.decemberspring.practicespring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class GreetingConsumer {
    private final GreetingService greetingService;
@Autowired
    public GreetingConsumer(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public void dispalyGreeting(){
        System.out.println(greetingService.greet());
    }
    @PostConstruct
    public void init(){
        System.out.println("greetingconsumer initializes");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("GreetingConsumer is being destroyed");
    }
}
