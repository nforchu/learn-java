package com.learnjava.inheritance;

public interface InterfaceA {
    public void doThingsInA();
    default void doInterfaceStuff(){
        System.out.println("stuff in interface A");
    }
}
