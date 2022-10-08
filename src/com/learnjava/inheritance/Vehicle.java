package com.learnjava.inheritance;

public interface  Vehicle {

    boolean  start();
    boolean stop();
    default void selfCheck() {

    }


}
