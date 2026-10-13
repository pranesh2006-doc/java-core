package com.oops.javacore;


interface editing{
    void edit();
}

interface photoshop{
    void photoshop();
}

class Smartphone implements editing,photoshop{
    public void photoshop(){
        System.out.println("Camera is working");
    }
    public void editing(){
        System.out.println("editing is done");
    }
}
