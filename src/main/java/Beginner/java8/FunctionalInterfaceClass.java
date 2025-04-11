package Beginner.java8;

@java.lang.FunctionalInterface
interface FunctionalInterface {
    int add(int a, int b);
    //int apply1(int a, int b);//❌ Compilation Error! Multiple non-overriding abstract methods found in interface
    // int subtract(int a, int b); // abstract

    default void defaultmetho() {
        System.out.println("Hi");
    }

    static void staticMethod() {  //Static methods in interfaces should have a body
        System.out.println("Static");
    }
}

interface B extends FunctionalInterface {
    int apply(int a, int b);

    int apply1(int a, int b);
}

public class FunctionalInterfaceClass {
    public static void main(String[] args) {
        FunctionalInterface obj = (a, b) -> a + b;
        //❌ Won’t compile! above if removes @FunctionalInterface & add 2 methods in Interface
        //  Java can’t map your lambda to two abstract methods — it gets confused.
        // ✅ Compiles without @FunctionalInterface
        //❌ But you cannot use a lambda expression with it if you add 2 abstract methods in interface

        System.out.println(obj.add(5, 3)); // Output: 8

    }
}

/**
 * If you don't annotate it with @FunctionalInterface, & add 2 abstract methods it may still compile, but you can't use it with lambdas.
 *
 * Case	                                        Compiles?	Lambdas Work?	Why?
 * ✅ One abstract method + @FunctionalInterface	✅	✅	Valid functional interface
 * ❌ Two abstract methods + @FunctionalInterface	❌	❌	Violates functional interface rule
 * ✅ Two abstract methods, no annotation	        ✅	❌	Not a functional interface, lambdas fail
 * 1. What is a functional interface? Can an interface with default methods be functional?
 * ✅ Expected Answer:
 * A functional interface has only one abstract method. Yes, it can have default and static methods, as long as only one abstract method exists.
 * 🧠 So the key difference is:
 * @FunctionalInterface = compiler enforces exactly one abstract method
 * No annotation = Java allows multiple abstract methods but with this java doesn't allow lambda expressions
 */