package com.learnjava.exception;

import com.learnjava.serialization.Employee;

import java.io.*;
import java.util.Scanner;

public class ExceptionHandler {
    private final String file = "C:\\workspace\\output\\employee.ser";

    public void divide(int a, int b) {
        try {
            System.out.println("before division");
            double result = a / b;
            System.out.println("after division");
            System.out.println(result);

            int[] numbers = {1, 2, 4};
            int j = numbers[5];

        }  catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {

        } finally {
            System.out.println("finally block");
        }
    }

    public void readFromFile() {

        try (Scanner scanner = new Scanner(new File("test.txt"))){
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void divideWithNoHandler(int a, int b) {
        double result = a / b;
        System.out.println(result);

    }

    public  void writeToDisk()  {
        Employee employee = new Employee("John", "Smith", "20/09/1984", "Finance");
        System.out.println(employee.toString());
        try{
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();
        } catch (FileNotFoundException ex) {
            throw new CustomException();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {

        }
        System.out.println("********************************************************");
    }
}

