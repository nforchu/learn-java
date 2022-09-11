package com.learnjava.students;

public class ArithMeticOperator {

    short a = 7;
    short b = 5;


    public short add() {
        return (short)(a + b);
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a*b;
    }

    public int divide() {
        double result = a / (b * 1.0);
        System.out.println(result);
        return (int)result;
    }

    public void modulus() {
        System.out.println(a % b);
    }
}
