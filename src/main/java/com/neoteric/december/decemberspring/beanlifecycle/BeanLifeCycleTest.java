package com.neoteric.december.decemberspring.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class BeanLifeCycleTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        BeanClass bean1=context.getBean(BeanClass.class);
        BeanClass bean2=context.getBean(BeanClass.class);
        System.out.println(bean1==bean2);
        context.close();
    }
}
