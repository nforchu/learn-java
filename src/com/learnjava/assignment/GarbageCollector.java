package com.learnjava.assignment;

import com.learnjava.students.Drink;

public class GarbageCollector {

    Drink drink = new Drink();

    public void run () {

        Drink drink1 = new Drink();

        Drink drink2 = this.drink;

        int age = 10;
    }


    public void continueRunning() {

        System.out.println(drink);
    }
}
