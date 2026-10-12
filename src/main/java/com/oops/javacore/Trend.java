package com.oops.javacore;

public class Trend {
    String name;
    int age;

      static String head="fuckup";

    Trend(String name,int age){
        this.name=name;
        this.age=age;
    }
    void show(){
        System.out.println("car name is : "+name+" and price is : "+age);
    }
}
