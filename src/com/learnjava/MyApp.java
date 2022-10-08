package com.learnjava;

import com.learnjava.assignment.CoffeeMachine;
import com.learnjava.assignment.GarbageCollector;
import com.learnjava.assignment.MysqlExample;
import com.learnjava.exception.ExceptionHandler;
import com.learnjava.inheritance.*;
import com.learnjava.serialization.EmployeeSerializer;
import com.learnjava.students.*;

import java.beans.beancontext.BeanContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyApp {

    public static void main(String [] arg) {
        new MysqlExample().connect();

        ExceptionHandler eh = new ExceptionHandler();
        eh.divide(10, 0);

        //eh.writeToDisk();



        /*CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start();*/

        /******************************Exception handling**********************/

        //StringBuffer
        //StringBuilder
        /*
        StringBuffer sb = new StringBuffer("ABC");
        sb.append("DEF");

        one(sb);

        two(sb);

        StringBuilder sbuilder = new StringBuilder("ACB");
        sbuilder.append("XYZ");* /


        /*String firstname = "Jonathan";
        String lastname = new String();
        String placeOfBirth = new String("USA");

        String str = new String("ABC");
        str = str + " DEF";

        "ABC"
        " DEF"
        "ABC DEF"
        System.out.println(str);

       String str1 = "123";
       String str2 = "123";
       str2 = "456";*/

        /*GarbageCollector collector = new GarbageCollector();
        collector.run();
        //continue doing more stuff

        collector.continueRunning();*/



        /********************wrapper classes**************************/

        //int Integer
        //byte Byte
        //double Double
        //boolean Boolean
        /*boolean done = true;

        int a = 6;
        Integer b = a;

        int c = b;
        int e = Integer.parseInt("Hello");

        List<Integer> list = new ArrayList<>();
        list.add(1);

        List<String> stringList = new ArrayList<>();

        stringList.add("Apple");
        stringList.add("Mangoes");*/

        /************************************Arrays*************************************************************/

        /*int [][] numberList = new int[4][];

        int [] numbers1 =  {1, 2, 10, 11, 12, 13};
        int [] numbers2 =  { 3, 4, 5};
        int [] numbers3 =  { 6, 7, 8, 9};
        int [] numbers4 =  { 20, 21, 22, 23};

        numberList[0] = numbers1;
        numberList[1] = numbers2;
        numberList[2] = numbers3;
        numberList[3] = numbers4;

        for(int i = 0; i < numberList.length; i++) {
            for(int j =0; j < numberList[i].length; j++) {
                System.out.println(String.format("numberList[%s][%s] =  %s ", i, j, numberList[i][j]));
            }
            if(i == 2) break;
        }

        String[] name = new String[9];*/


        /*int [] number = new int[30];
        for(int i = 0 ; i <30 ; i++) {
            int j = i+1;
            number[i] = i+1;
            //System.out.println(String.format("number[%s] =  %s", i, j));
        }

        Drink [] drink = new Drink[7];

        Vehicle [] vehicles = new Car[7];
        vehicles[0] = new Car();

        vehicles[4] = new Car();
        for (int i =0; i < vehicles.length ; i++ ){
           // System.out.println(String.format("vehicles[%s] =  %s", i, vehicles[i]));
        }*/
        /****************************** nested classes **********************************************************/

/*
        String[] fruits = {"Cheries", "Apple", "Mangoes", "Pears"};
        for (int i =0; i < fruits.length ; i++ ){
            System.out.println(String.format("fruits[%s] =  %s", i, fruits[i]));
        }
        System.out.println("==========================================");
        Arrays.sort(fruits);
        for (int i =0; i < fruits.length ; i++ ){
            System.out.println(String.format("fruits[%s] =  %s", i, fruits[i]));
        }*/


        /*Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Cow sound");
            }
        };

        animal.makeSound();

        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.doStuff();

        OuterClass.NestedClass.doStaticStuff();

        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        nestedClass.doStuff(); */



        /*********************Method overloading********************************/

       /* OverloadExample  ov = new OverloadExample();
        ov.display(2.0F, 3);*/

        //ov.display(29, "John");

        /*************************************************Pass by reference******************************/

       /* Drink drink0  =  new Drink(1, "Hot cocoa", 1.2F);
        Drink drink1  =  new Drink(1, "Hot cocoa", 1.2F);
        Drink drink2  =  new Drink(2, "Espresso", 2.2F);
        //System.out.println("Drink0 ==" +drink0.toString());
        //System.out.println("Drink1 ==" +drink1.toString());
        //System.out.println("Drink0 is equal to drink1---" +(drink0.equals(drink1)));


        Drink drink3 = (Drink) drink0.clone();
        drink0.name = "Coke";
        drink2.name = "Fanta";
        System.out.println("Drink0 ==" +drink0.toString());
        System.out.println("Drink3 ==" +drink3.toString());
        System.out.println("Drink0 is equal to drink3---" +(drink0.equals(drink3)));*/

        /*******************serialization***************************************/
       /* EmployeeSerializer es = new EmployeeSerializer();
        es.writeToDisk();
        es.readFromDisk();*/

        /******************************Multiple inheritance****************************************/
       /* ClassC c = new ClassC();
        c.doThingsInB();
        c.doThingsInA();

        Car car = new Car();
        car.stop();

        car.selfCheck();*/


       /* if(vehicle instanceof  Car) {
            Car car = (Car)vehicle;
            car.shiftGear();
        } else if( vehicle instanceof Plane) {
            Plane plane = (Plane) vehicle;
            plane.glide();
        }



        System.out.println("==================");

        Vehicle vehicle1 = new AirPlane();
        vehicle1.start();
        if(vehicle1 instanceof  AirPlane) {
            ((AirPlane)vehicle1).glide();
        }

        AirPlane airPlane = (AirPlane) vehicle1;*/


        /*SeaPlane seaPlane = new SeaPlane();
        seaPlane.start();
        seaPlane.moveWings();*/
        //Car car = new Car("XYZ");
        //car.start();

        //AirPlane airPlane = new AirPlane();
        //airPlane.start();

        /**********************break and continue**********************/
       /* BreakAndContinue bc = new BreakAndContinue();
        bc.doContinue();*/


       /***********************Coffee Machine assignment*******************************/
       /* CoffeeMachine machine = new CoffeeMachine();
        machine.start();*/

        /*****************************************loops**************************************************/
        // for (standard for loop/ enhanced for loop), while, do.. while
        /*

        int [] scores  = {20, 14, 16, 11, 8, 2 };
        int y = 6;

        System.out.println("====================do while===============================");
        do {
            System.out.println("running do block " + y);
            y++;
        } while (y < scores.length);

        System.out.println("====================while===============================");

        int x = 6;
        while(y < scores.length) {
            System.out.println("running while block "+ + x);
            //System.out.println(String.format("scores[%s] = %s", y , scores[y]));
            y++;
        }*/


        /*for(int i = 0; i < scores.length; i++) {
            System.out.println(String.format("scores[%s] = %s", i , scores[i]));
        }

        for(int score: scores) {
            System.out.println(score);
        }*/

        /*****************************************Flow control**************************************************/


        /*Drink drink1  =  new Drink(1, "Hot cocoa", 1.2F);
        Drink drink2  =  new Drink(2, "Espresso", 2.2F);
        Drink drink3  =  new Drink(3, "Cappuccino", 3.2F);

        Drink [] drinks = {drink1, drink2, drink3};

        Scanner scanner = new Scanner(System.in);
        for (Drink drink : drinks) {
            System.out.println(String.format("%s. %s %s", drink.id, drink.name, drink.price));
        }

        System.out.print("Enter you choice 1, 2 or 3 : ");
        int exp = scanner.nextInt();
        switch (exp) {
            case 1:
                System.out.println("Here is is cup of Hot cocoa for you");
                break;
            case 2:
                System.out.println("Here is is cup of espresso for you");
                break;
            case 3:
                System.out.println("Here is is cup of Cappuccino for you");
                break;
            default:
                System.out.println("Sorry we do not have an offer for that. Enter 1, 2 or 3");
        }*/






       /* int age = 71;

        if(checkAge(age)) {
            System.out.println("You are very young!");
        } else if(age == 50) {
            System.out.println("You get a gold medal");
        } else if (age ==70) {System.out.println("You are of age");}

        System.out.println("some other print outs");*/





        /**************************************Java static ****************************************************/

       /* Student stn  = new Student();
        stn.toString();
        Student.initializeNumberOfStudents();
        Student student1 = new Student();
        System.out.println("1 numberOfStudents is "+ student1.numberOfStudents);
        student1.firstname = "James";
        Student student2 = new Student();
        System.out.println("2 numberOfStudents is "+ student2.numberOfStudents);
        student2.firstname = "Rebecca";


        System.out.println("Student 1 is " +student1);
        System.out.println("Student 1 is " +Student.numberOfStudents);
        System.out.println("==================================================");
        System.out.println("Student 2 is " +student2);
        System.out.println("Student 2 is "+student2.numberOfStudents);


        student1.numberOfStudents = 59;
        student1.firstname = "Mary";
        System.out.println("After change "+student2.numberOfStudents);
        System.out.println("After change "+student2.firstname);*/


        /************************************java.util.Scanner**************************************/
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill in the interactive terminal for a customized greeting.");
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        String drink = age <= 18 ? "a glass of Orange Juice": "an Espresso";

        System.out.println(String.format("Welcome %s. You will be having %s", name, drink));

    */




        /******************************************Pass by reference and pass by value*************************************************************/
        /*Calculator calculator = new Calculator();
        int a = 3; int b = 7;
        System.out.println(String.format("Before call to Calculator class a is %s and b is %s ", a , b));

        calculator.doAverage(a, b);
        System.out.println(String.format("after call toCalculator class a is %s and b is %s ", a , b));
         a = 40; b = 100;
        System.out.println(String.format("after call toCalculator class a is %s and b is %s ", a , b));

        System.out.println("===================================================");


        Calculator calc = new Calculator();
        Result result = new Result();
        result.bioScore = 12;
        result.mathScore = 15;
        System.out.println(String.format("Before call to doAverage class bio is %s and math is %s ", result.bioScore , result.mathScore));
        calc.doAverage(result);
        System.out.println(String.format("After call to doAverage class bio is %s and math is %s ", result.bioScore , result.mathScore));
        */

        //Alphabet alphabet = new Alphabet();

        /*Student student0 = new Student("James", "Smith", "Mathematics");
        System.out.println("====================================================");
        Student student1 = new Student("James", "Smith");*/

        /*Student student1 = new Student("Anthony", "Miller");
        student1.calculateAverage(10);
        System.out.println(student1);



        Student student2 = new Student("Princewill", "Nforchu", 12.9F, 36);
        System.out.println(student2);*/





        //LogicalOperator lg =  new LogicalOperator();
        //lg.testLogicalAnd();
        //lg.testLogicalOr();
        //System.out.println(10 ^ 5);
        //new ArithMeticOperator().modulus();
        //new UnaryOperator().testOperators();

        //alphabet.loopThroughAtoZ();
       // new OtherOperator().testTernary();
        /*Student student1 = new Student();
        student1.lastname = "john";
        student1.firstname = "kerry";
        student1.age = 30;
        System.out.println(student1);


        Student student2 = new Student();
        student2.lastname = "Anderson";
        student2.firstname = "Martha";
        student2.age = 23;

        System.out.println(student2);*/
    }

    public static void one(StringBuffer value) {
        value.append("RST");
    }

    public static void two(StringBuffer value) {
        value.append("UVW");
    }
}
