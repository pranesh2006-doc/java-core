package com.oops.javacore;

import java.util.ArrayList;

public class Main6 {
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<String>();
        list.add("Teju");
        list.add("Pranesh");
        list.add("Teju love Pranesh");
        System.out.println(list);
        list.add(1,"Teju love Pranesh");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        
    }
    
}
