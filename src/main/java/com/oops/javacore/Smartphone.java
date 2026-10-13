package com.oops.javacore;


interface editing{
    void edit();
}

interface photoshop{
    void photo();
}

class Smartphone implements editing ,photoshop {
    public void photo(){
        System.out.println("Camera is working");
    }
    public void edit(){
        System.out.println("editing is done");
    }
}
