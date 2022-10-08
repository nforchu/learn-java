package com.learnjava;

public class OuterClass {

    int a;
    static int b;

    public void doInstanceStuff() {
        InnerClass innerClass = new InnerClass();
        innerClass.doStuff();


        NestedClass.doStaticStuff();
    }

    public static void doClassStuff() {

    }

    public class InnerClass {
        int a;
        static int b;

        public void doStuff() {
            System.out.println("stuff in nestedClass");
        }

    }


    public  static class NestedClass {
        int a;
        static int b;

        public void doStuff() {
            System.out.println("stuff in nestedClass");
        }

        public static  void doStaticStuff() {
            System.out.println("Static stuff in nestedClass");
        }
    }

    public void methodWithClass() {
        int b;
        class LocalClass {

        }
    }

}
