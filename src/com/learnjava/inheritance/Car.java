package com.learnjava.inheritance;

import com.learnjava.students.Calculator;

public class Car implements Vehicle {
    public String state;

    public Car(){
        System.out.println("Car constructor");
    }

    public Car(String engineType){
        System.out.println("Car constructor");
    }

    protected int numberOfWheels = 4;

    @Override
    public boolean start() {
        this.state = "running";
        System.out.println("Started the car. State is " +this.state);
        return true;
    }

    public  boolean stop(){
        return true;
    }

}
