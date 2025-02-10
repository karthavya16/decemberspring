package com.neoteric.december.decemberspring.beanlifecycle;

public class BeanClass {

    public BeanClass(){
        System.out.println("bean is intalised");
    }

  public void init(){
      System.out.println("bean is intalized");
  }
  public void destroy(){
      System.out.println("bean is destroyed");
  }
}
