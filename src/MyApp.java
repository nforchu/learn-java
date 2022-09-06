import java.util.Scanner;

public class MyApp {
    
    public static void main(String [] arg) {
        
        int x = 5;

        x  -= 3; // x = x + 3
        System.out.println("X is " +x);

        //LogicalOperator lg =  new LogicalOperator();
        //lg.testLogicalAnd();
        //lg.testLogicalOr();
        //System.out.println(10 ^ 5);
        //new ArithMeticOperator().modulus();
        //new UnaryOperator().testOperators();
        Alphabet alphabet = new Alphabet();
        //alphabet.loopThroughAtoZ();
       // new OtherOperator().testTernary();
        Student student1 = new Student();
        student1.lastname = "john";
        student1.firstname = "kerry";
        student1.age = 30;
        System.out.println(student1);


        Student student2 = new Student();
        student2.lastname = "Anderson";
        student2.firstname = "Martha";
        student2.age = 23;

        System.out.println(student2);
    }
}
