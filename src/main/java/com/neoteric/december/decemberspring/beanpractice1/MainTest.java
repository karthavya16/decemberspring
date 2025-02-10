package com.neoteric.december.decemberspring.beanpractice1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        MyApp myAppobj=context.getBean(MyApp.class);
        myAppobj.run();
        MyService serviceobj=context.getBean(MyService.class);
        serviceobj.perfromServiceTask();

        MyRepository repositoryobj=context.getBean(MyRepository.class);
        repositoryobj.performRepositoryTask();
    }
}
