package com.neoteric.december.decemberspring.jsonconverting;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Person {
    private String name;
    private int age;
    private List<String> roles;

    public Person(String name, int age, List<String> roles) {
        this.name = name;
        this.age = age;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roles=" + roles +
                '}';
    }
}
