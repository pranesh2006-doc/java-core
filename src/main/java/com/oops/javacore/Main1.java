package com.oops.javacore;

//this: Refers to the current class object's variables, methods, or constructor.

//- super: Refers to the immediate parent class's variables, methods, or constructor.

class Animal{

    //variables
    String name="Teju";
   //Method
    void sound(){
        System.out.println("I'm a animal");
    }
    //constructor
    Animal(String last){
        System.out.println("my name is "+last);
    }
}
class Dog extends Animal{
    //variables
    String name="Pranesh";

    //Method
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
    //constructor
    Dog(){
         super("teju");
         System.out.println("hey i luv u : "+this.name);
    }
}


public class Main1 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.show();
        dog.display();

    }
}
