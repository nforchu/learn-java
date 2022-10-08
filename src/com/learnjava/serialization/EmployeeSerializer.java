package com.learnjava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializer {
    private final String file = "C:\\workspace\\output\\employee.ser";

   public  void writeToDisk() {
        Employee employee = new Employee("John", "Smith", "20/09/1984", "Finance");
        System.out.println(employee.toString());
        try{
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       System.out.println("********************************************************");
    }

    public void readFromDisk() {
        Employee employee = null;
       try {
           FileInputStream fileIn = new FileInputStream(file);
           ObjectInputStream in = new ObjectInputStream(fileIn);
           employee = (Employee) in.readObject();
           in.close();
           fileIn.close();
       }catch (Exception ex) {
           ex.printStackTrace();
           return;
       }
        System.out.println(employee.toString());
    }
}
