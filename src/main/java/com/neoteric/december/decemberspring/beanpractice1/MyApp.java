package com.neoteric.december.decemberspring.beanpractice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {

    private final MyService myService;

    @Autowired
    public MyApp (MyService myService){
        this.myService=myService;
    }
    public  void run(){
        myService.perfromServiceTask();
    }
}
