package com.neoteric.december.decemberspring.practicespring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "prod");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
GreetingConsumer consumer=context.getBean(GreetingConsumer.class);
        consumer.dispalyGreeting();
        GreetingConsumer anotherConsumer = context.getBean(GreetingConsumer.class);
        System.out.println("Are beans the same? " + (consumer == anotherConsumer));

        // Close context
        context.close();
    }
}
