package com.neoteric.december.decemberspring.exception;

public class MaintestException {
    public static void validateAge(int age){
        if(age<18){
            throw new IllegalArgumentException("AGE MUST BE 18 OR ABOVE");

        }
        System.out.println("age is valid");

    }

    public static void main(String[] args) {
        validateAge(18);
    }
}
