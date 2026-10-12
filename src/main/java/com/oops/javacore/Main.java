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

       //constructor class
        Student s1=new Student("pranesh",21,0.00);
        Student s2=new Student("teju",19,100.00);
        System.out.println(s1.name);
        System.out.println(s2.name);

        //overloading constructor

        User u1=new User();
        User u2=new User("pranesh");
        User u3=new User("teju","like");
        User u4=new User("pranesh","t#16",21);

        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u2.name);
        System.out.println(u3.name);
        System.out.println(u4.age);

        //array of objects

        Trend[] trend =new Trend[3];

        trend[0]= new Trend("bmw",200);
        trend[1]= new Trend("kmw",200);
        trend[2]= new Trend("kmw",200);

        for(int i=0;i< trend.length;i++){
            trend[i].age=300;
        }
        for(int i=0;i< trend.length;i++){
            trend[i].show();
        }

       //The `static` keyword in Java is used to define members that belong to the class rather than to individual objects.
        //
        //A static variable is shared among all objects of a class, while an instance variable has a separate copy for each object. Static methods can be called using the class name without creating an object.
        //
        //For example, `Math.max(10, 20)` can be called without creating a `Math` object because `max()` is a static method.

         trend[0].show();
        //static varible or static method is called using class , without creating the object or an instances itself
        System.out.print(Trend.head);
    }
}
