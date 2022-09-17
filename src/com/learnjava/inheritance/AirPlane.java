package com.learnjava.inheritance;

public class AirPlane extends Plane{


    @Override
    public  boolean start() {
        this.state = "running";
        System.out.println("Started the plane. State is " +this.state);
        return true;
    }

    public  boolean stop(){
        return true;
    }
}
