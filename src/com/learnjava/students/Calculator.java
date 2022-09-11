package com.learnjava.students;

public class Calculator {

    static  byte a = 3;
    static short b = 3276;
    static int y = 5000;
    static long x = 7777777777L;

    static float j = 1.400099F;

    static double k = 34.99999999999D;

    static boolean done =  true;

    static char letter = 'C';

    int age = 20;

    public void subtract (int a, int b) {
        a = 44;
        this.age = 55;
        System.out.println( "class age" +this.age);
        int age = 50;
        System.out.println( "method age" +age);
    }

    public void add (int a, int b) {
        a = 44;
        age = 39;
    }

    public void doAverage(int a, int b){
        System.out.println(String.format("Before change in Calculator class a is %s and b is %s ", a , b));
        a = 5; b =20;
        System.out.println(String.format("after change in calculator a is %s and b is %s ", a , b));
    }

    public void doAverage(Result result){

        System.out.println(String.format("Before update  bio is %s and math is %s ", result.bioScore , result.mathScore));
        result.bioScore = 200;
        result.mathScore = 150;
        System.out.println(String.format("After update bio is %s and math is %s ", result.bioScore , result.mathScore));
    }

}


