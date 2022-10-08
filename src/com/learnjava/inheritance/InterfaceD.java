package com.learnjava.inheritance;

public interface InterfaceD {
    default  void doInterfaceStuff(){
        System.out.println("stuff in interface D");
    }
}
