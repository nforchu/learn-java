package com.learnjava.inheritance;

public abstract class Plane implements Vehicle{

    public String state;

    @Override
    public abstract boolean start();


    public void moveWings() {
        System.out.println("Move wings");
    }
}
