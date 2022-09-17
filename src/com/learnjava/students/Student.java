package com.learnjava.students;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Student {

    final String DATE_OF_BIRTH = "09/09/2000";

    public String firstname;
    String lastname;
    String name;
    int age;
    boolean present;
    private float average;

    public static int numberOfStudents;



    public Student(){

        System.out.println("constructor ran");
        numberOfStudents++;
    }

    static {
        numberOfStudents = 10; ///do some code to get this data
        System.out.println("static block ran");
    }


    public static void initializeNumberOfStudents(){
        numberOfStudents = 50;
    }

    public Student(String... args) {
        for( String ln: args) {
            System.out.println(ln);
        }
    }

   /* public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public Student(String firstname, String lastname, float avg, int age) {
        if(avg  > 20 ) {
            throw new IllegalArgumentException("Average must not be greater than 20");
        }
        this.average = avg;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }*/

    public void calculateAverage(float avg){
        if(avg  > 20 ) {
            throw new IllegalArgumentException("Average must not be greater than 20");
        }
        this.average = avg;
        System.out.println("The average is "+average);
    }


    public void printLetter(String...names) {
        for( String ln: names) {
            System.out.println(String.format("Hello %s , How are you doing today ?", ln));
        }

    }

    public void showStudentName() {
        this.firstname = "jones";
        System.out.println(String.format("%s %s ", firstname, lastname));
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", present=" + present +
                ", average=" + average +
                '}';
    }
}
