package com.neoteric.december.decemberspring.package1;

public class String1 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=sb1;
        sb1.append("d");
        System.out.println(sb1=sb2);
    }
}
