package com.learnjava.inheritance;

public abstract class Plane implements Vehicle{

    public String state;


    public void moveWings() {
        System.out.println("Move wings");
    }

    public void glide(){
        System.out.println("The plane now glides");
    }
}
