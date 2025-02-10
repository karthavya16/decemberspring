package com.neoteric.december.decemberspring.abstractpractice.animalpractice;

public abstract class Animal {
    public String name;
    public Animal (String name){
        this.name=name;

    }

    abstract void makesound();
     void eat(){
         System.out.println(name+" is eating");


     }
}
