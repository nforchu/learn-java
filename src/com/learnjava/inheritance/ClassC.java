package com.learnjava.inheritance;

public class ClassC extends ClassB implements InterfaceA, InterfaceD{
    @Override
    public void doThingsInA() {
        System.out.println("Implementation of A");
    }

    @Override
    public void doInterfaceStuff() {

    }
}
