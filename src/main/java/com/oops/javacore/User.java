package com.oops.javacore;

//Constructor overloading allows a class to initialize objects in different ways by using
// constructors with different parameter lists.
public class User {
    String name;
    String password;
    int age;
   User(){
       this.name="User";
       this.password="password";
       this.age=0;
   }
   User(String name){
       this.name=name;
       this.password="pht";
       this.age=0;

   }

     User(String name,String password){
        this.name=name;
        this.password=password;
        this.age=0;
    }
   User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }


}
