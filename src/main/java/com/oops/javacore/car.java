package com.oops.javacore;

//Class: A blueprint that defines properties and methods.

//Object: An instance of a class with its own state and behavior.

public class car {

    String name="BMW";
    int model=3;
    double price=90.9999;
    char color='B';
    boolean result=false;

void start(){
    result=true;
System.out.println("car get started"+result);
}
void end(){
    result=false;
System.out.println("car get ended"+result);
}


}
