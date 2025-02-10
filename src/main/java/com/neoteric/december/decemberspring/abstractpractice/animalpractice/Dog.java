package com.neoteric.december.decemberspring.abstractpractice.animalpractice;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void makesound() {
        System.out.println(name+"says wooooo");

    }
}
