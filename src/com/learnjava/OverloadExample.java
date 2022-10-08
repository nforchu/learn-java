package com.learnjava;

public class OverloadExample {


    public void display(int a, int b){
        System.out.println(String.format("From int: a = %s b = %s", a , b));
    }

    public void display(float a, int b){
        System.out.println(String.format("from Float : a = %s b = %s", a , b));
    }

    public void display(int a, float b){
        System.out.println(String.format("from Float : a = %s b = %s", a , b));
    }

    public void display(int a){
        System.out.println(String.format("a = %s", a ));
    }

    public void display(int age, String name){
        System.out.println(String.format("age = %s name = %s", age, name));
    }

    public void display(Object obj){
        System.out.println(String.format("a = %s", toString()));
    }


}
