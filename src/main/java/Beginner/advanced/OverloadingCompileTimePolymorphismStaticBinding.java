package Beginner.advanced;

class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingCompileTimePolymorphismStaticBinding {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 4));
        System.out.println(c.add(2.6, 4.7));
        System.out.println(c.add(2, 4, 6));
    }
}
