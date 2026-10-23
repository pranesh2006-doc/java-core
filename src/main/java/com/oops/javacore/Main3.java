package com.oops.javacore;

//. Compile-time polymorphism
//Also called method overloading.
//The same method name has different parameter lists.

class overloading{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

}
class overloading1 extends overloading{
    int add(float a,float b){
        return (int)(a+b);
    }
}

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        overloading1 obj = new overloading1();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(10.5f,20.5f));
    }
}
