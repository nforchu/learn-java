package com.learnjava.inheritance;

public final class SeaPlane extends Plane{

    private String dimensions;


    public boolean start() {
        this.state = "running";
        System.out.println("Started the plane. State is " +this.state);
        return true;
    }

    public  boolean stop(){
        return true;
    }
}
