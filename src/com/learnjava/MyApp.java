package com.learnjava;

import com.learnjava.assignment.CoffeeMachine;
import com.learnjava.students.Calculator;
import com.learnjava.students.Drink;
import com.learnjava.students.Result;
import com.learnjava.students.Student;

import java.util.Scanner;


public class MyApp {


    private static boolean checkAge(int age) {
        return age < 20 && age != 50;
    }
    
    public static void main(String [] arg) {


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
}
