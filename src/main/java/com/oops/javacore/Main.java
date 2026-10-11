package com.oops.javacore;


//PSVM (public static void main(String[] args)): The standard entry point of a Java application.
//- public: Accessible from outside the class.
//- static: Callable without creating an object.
//- void: Returns no value.
//- main: Entry-point method name.
//- String[] args: Receives command-line arguments.

public class Main {
    public static void main(String[] args) {
       car ch=new car();

       System.out.println(ch.name);
       System.out.println(ch.model);
       System.out.println(ch.price);
       System.out.println(ch.color);

       ch.start();
       ch.end();
    }
}
