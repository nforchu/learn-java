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
}
