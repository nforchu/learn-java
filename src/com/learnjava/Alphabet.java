package com.learnjava;

public class Alphabet {

    String name;
    protected  Alphabet(){

    }

    /**
     * It prints out the capital and lowercase letters from A to Z
     */
    void loopThroughAtoZ (){
        char letter = 'A';
        for (int i = 1; i <=26; i++) {
            System.out.print(String.format("%s%s ", letter, (char)(letter+32)));
            letter++;
        }
    }
}
