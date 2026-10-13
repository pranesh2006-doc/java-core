package com.oops.javacore;


//PSVM (public static void main(String[] args)): The standard entry point of a Java application.
//- public: Accessible from outside the class.
//- static: Callable without creating an object.
//- void: Returns no value.
//- main: Entry-point method name.
//- String[] args: Receives command-line arguments.

public class Main {
    public static void main(String[] args) {
// Inheritance is a feature in Java where one class acquires accessible fields and methods from another class.

        // SINGLE INHERITANCE One child class inherits from one parent class.
        Dog dog = new Dog();

        dog.eat();
        dog.sound();

        //Multilevel inheritance
        //A class inherits from a child class, forming a chain of inheritance.

      Puppy  puppy = new Puppy();

      puppy.eat();
      puppy.sound();
      puppy.weep();


    }
}
