package Beginner.OOPS;

/**
 * Can I call interface methods without creating a separate class, just inside the class that has main() and implements the interface?
 * ✅Absolutely yes!
 * Here's your code slightly updated and working without needing any extra classes:
 */
interface MyInterface {
    default void myMethod() {
        System.out.println("This is a default method.");
    }

    void makeSound(); // abstract method
}

public class DefaultMethodInterface implements MyInterface {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public static void main(String[] args) {
        // ✅ Create an object of the same class (which implements the interface)
        DefaultMethodInterface obj = new DefaultMethodInterface();

        /**If you want to use the interface type for polymorphism:
         MyInterface obj = new DefaultMethodInterface();
         */

        obj.myMethod();             // Output: Woof!
        obj.makeSound();            // Output: This is a default method.
    }
}
/*
✅ What is a Default Method in an Interface?
A default method in an interface is a method with a body, introduced in Java 8, which allows interfaces to evolve without breaking existing implementations.
1. What happens if two interfaces have the same default method?
👉 You must override it in the implementing class.
2. Can default methods access private methods?
✅ Yes (since Java 9). Interfaces can have private methods used by default methods internally.
Feature	Description
Has method body	                                ✅ Yes
Must be marked default	                        ✅ Yes
Can be overridden	                            ✅ Yes
Cannot be static or abstract at the same time	❌ No
Used to provide default behavior	            ✅ Yes
 */