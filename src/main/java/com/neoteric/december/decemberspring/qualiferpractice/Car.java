package com.neoteric.december.decemberspring.qualiferpractice;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("car started");
    }
}
