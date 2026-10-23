package com.oops;
import java.util.Scanner;
//Compile-time polymorphism
//Also called method overriding.

class overriding{
    void display(){
        System.out.println("I'm a parent class method");
    }
}
class overriding1 extends overriding{
    @Override
    void display(){
        System.out.println("I'm a child class method");
    }
}
class overriding2 extends overriding1{
    @Override
    void display(){
        System.out.println("I'm a grand child class method");
    }
}

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        overriding o1;
        int choice=sc.nextInt();
        if(choice==1){
            o1=new overriding();
            o1.display();
        }
        else if(choice==2){
            o1=new overriding1();
            o1.display();
        }
        else{
            o1=new overriding2();
            o1.display();
        }
    }
}

    