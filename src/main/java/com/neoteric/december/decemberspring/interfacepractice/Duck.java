package com.neoteric.december.decemberspring.interfacepractice;

public class Duck implements Flyable,Swimable {
    @Override
    public void fly() {
        System.out.println("duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("duck is swiming");
    }
}
