package Beginner.java8;

interface A {
    void show();  // One abstract method
    // void another(); // ❌ Now 2 abstract methods - will cause error

}

@java.lang.FunctionalInterface
interface B1 extends A {
    // Inherits 'show()' from A1 — no extra abstract methods

    // void another(); // ❌ Now 2 abstract methods - will cause error
}

public class FunctionalInterfaceExtendNonFunctionalInterface {
    public static void main(String[] args) {
        B1 obj = () -> System.out.println("Hello from show()");// ✅ Lambda expression
        //B1 is a functional interface → only one abstract method (show()).
        //() -> System.out.println("Hello from show()") is a lambda expression → it’s Java’s shorthand syntax for implementing that method.

        // ⚠️ Nothing runs yet! above's just defining behavior.

        obj.show(); // ✅ Now we call the method → Output: Hello from show()

//🧱 "Create an object of a class that implements B1, and provide the logic of show()."

        B1 obj1 = new B1() {
            @Override
            public void show() {
                System.out.println("Hello from Traditional show()");
            }
        };
        obj1.show();

        /**
         B1 obj1 = new B1();
         obj1.show(); // ❓ why not this?
         Because B1 is an interface, and interfaces cannot be instantiated directly!
         B1 obj1 = new B1(); // ❌ Compilation Error
         B1 is abstract; cannot be instantiated

         ✅ What does work?
         You must either:

         ✅ 1. Use a lambda (if it's a functional interface):
         B1 obj = () -> System.out.println("Hello from show()");
         obj.show();

         ✅ 2. Use an anonymous inner class (what you're asking about):
            B1 obj = new B1() {
                @Override
                public void show() {
                System.out.println("Hello from show()");
                }
            };
         obj.show(); // ✅ Works

         ✅ 3. Or make a separate class that implements B1:
         class MyImpl implements B1 {
             public void show() {
             System.out.println("Implemented in a class");
             }
         }

         public class Main {
             public static void main(String[] args) {
                 B1 obj = new MyImpl();
                 obj.show(); // ✅ Works
             }
         }
         **/
    }
}
/**
 * E.g.
 * Runnable r = () -> System.out.println("Running...");
 * // No output yet
 * r.run(); // Now it prints: Running...
 * <p>
 * 🧠 Lambda expressions are not executed immediately. They are just function bodies stored in a variable — and only run when you call the method on them.
 */