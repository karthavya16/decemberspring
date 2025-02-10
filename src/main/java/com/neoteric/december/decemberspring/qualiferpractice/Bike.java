package com.neoteric.december.decemberspring.qualiferpractice;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("bike started");
    }
}
