package com.oops.javacore;

class gettersetter{
    private String name;
     
    public void setName(String name){
        this.name=name;
        
    }
}

public class Main5 {
    public static void main(String[] args){
        
        System.out.println("Hello, World!");

        gettersetter obj = new gettersetter();
        obj.setName("Teju");
       
    }
    
}
