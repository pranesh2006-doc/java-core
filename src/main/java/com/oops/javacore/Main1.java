package com.oops.javacore;


class Animal{

    String name="world";

    void sound(){
        System.out.println("I'm a animal");
    }
}
class Dog extends Animal{
    String name="hello";

     @Override
     void sound(){
         System.out.println("I'm a dog");
     }

    void show(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
    void display(){
         this.sound();
         super.sound();
    }
}

public class Main1 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.show();

    }
}
