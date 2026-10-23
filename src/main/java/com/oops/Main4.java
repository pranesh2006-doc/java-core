package com.oops;
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
    }
}
