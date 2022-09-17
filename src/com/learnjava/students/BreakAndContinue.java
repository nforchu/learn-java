package com.learnjava.students;

public class BreakAndContinue {



    public  void doBreak(){
        for(int i = 1; i <=20; i++) {

            if(i == 10) {
                break;
            }
            System.out.println("The value of i is "+ i);
        }

    }

    public void doContinue() {
        for(int i = 1; i <=20; i++) {

            if(i%2 == 0) {
                continue;
            }
            System.out.println("The value of i is "+ i);
        }
    }
}
