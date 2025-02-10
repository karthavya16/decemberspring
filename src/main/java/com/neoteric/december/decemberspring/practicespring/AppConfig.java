package com.neoteric.december.decemberspring.practicespring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = " com.neoteric.december.decemberspring.practicespring")
public class AppConfig {
    @Lazy
    public GreetingConsumer lazyConsumer() {
        return new GreetingConsumer(null);
    }
}
