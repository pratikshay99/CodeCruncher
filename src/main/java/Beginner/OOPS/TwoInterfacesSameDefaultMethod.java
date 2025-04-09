package Beginner.OOPS;

interface A6 {
    default void hello() {
        System.out.println("Hello from A");
    }
}

interface B6 {
    default void hello() {
        System.out.println("Hello from B");
    }
}

//compilation error if 2 same default methods & don't override then
public class TwoInterfacesSameDefaultMethod implements A6, B6 {
    public void hello() {
        System.out.println("Resolved conflict");
    }
}
/**
1. What happens if two interfaces have the same default method?
👉 You must override it in the implementing class.
2. Can default methods access private methods?
✅ Yes (since Java 9). Interfaces can have private methods used by default methods internally.
 */
