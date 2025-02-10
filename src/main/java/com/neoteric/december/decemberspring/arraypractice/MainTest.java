package com.neoteric.december.decemberspring.arraypractice;

public class MainTest {
    public static void main(String[] args) {
        Student[] arrray=new Student[5];
        arrray[0]=new Student(23,"kk1");
        arrray[1]=new Student(25,"kk2");
        arrray[2]=new Student(26,"kk3");
        arrray[3]=new Student(27,"kk4");
        arrray[4]=new Student(28,"kk5");
        for(int i=0;i< arrray.length;i++)
        System.out.println(arrray[i].rollno+arrray[i].name);

    }
}
