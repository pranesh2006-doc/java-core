package com.oops.javacore;


class Animal{

    String name="world";
}
class Dog extends Animal{
    String name="hello";

    void show(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

public class Main1 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.show();

    }
}
