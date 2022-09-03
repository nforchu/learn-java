public class UnaryOperator {

    int x = 10;
    public void testOperators() {
        // ++x
        System.out.println("++x");
        System.out.println("The value of ex is " + (++x));
        System.out.println("==========================================");

        //reinitialize x to 10
        x = 10;
        System.out.println("x++");
        System.out.println("The value of ex is " + (x++));
        System.out.println("==========================================");

        x = 10;
        System.out.println("--x");
        System.out.println("The value of ex is " + (--x));
        System.out.println("==========================================");

        x = 10;
        System.out.println("x++");
        System.out.println("The value of ex is " + (x--));
        System.out.println("==========================================");

        boolean done = true;
        System.out.println("! operator");
        System.out.println("The value of ex is " + (!done));
        System.out.println("==========================================");


    }
}
