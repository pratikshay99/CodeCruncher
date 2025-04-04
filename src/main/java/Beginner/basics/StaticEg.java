package Beginner.basics;

class Example {
    static int count = 0;                       // Shared by all objects

    Example() {
        // static int count = 0;                //🚨Modifier 'static' not allowed here
        count++;                                // Increments for every object created
    }

    void instanceMethod() {
        // static int count = 0;                //🚨Modifier 'static' not allowed here
        System.out.println("Instance method called");
        staticMethod();                         // ✅ Calling static method from non-static method
    }

    static void staticMethod() {
        //static int count = 0;                   //🚨Modifier 'static' not allowed here
        System.out.println("Static method called");
        //instanceMethod();                           // ❌ Compilation error
        // ✅ How to fix it? => Create an object inside the static method.
        Example obj = new Example();  // ✅ Create object
        obj.instanceMethod();         // ✅ Call non-static method

    }
}

public class StaticEg {
    //static int count = 0;                     //✅

    public static void main(String[] args) {
        // static int count = 0;                //🚨Modifier 'static' not allowed here
        Example obj1 = new Example();
        Example obj2 = new Example();

        System.out.println(Example.count);      // Output: 2    //staticVariable

        Example.staticMethod();                 // Output: 25   //staticMethod

        Example obj = new Example();
        obj.instanceMethod();

    }
}
/*
// static int count = 0;   ❌ inside constructor/method → NOT allowed
1️⃣ static Variable (Class-Level Variable)
At class level, outside methods, constructors, or blocks.
Because static variables can only be declared: At class level, outside methods, constructors, or blocks.
Belongs to the class, not instances (shared by all objects).
Stored in method area, not heap memory.
📌 Best use case: Constants, counters, configuration variables.
2️⃣static Methods (Class Methods)
Can be called without creating an object.
Can only access static variables & other static methods.
📌 Best use case: Utility methods (Math.sqrt(), Collections.sort()).
✅ Can a non-static method call a static method?
Yes, Because static methods belong to the class, and non-static methods have access to the class, so they can freely call static stuff.
❌ Can a static method call a non-static method
-❌ No (unless you create object)
-No, Because non-static methods need an object (they belong to instances), but static methods run without any object.
3️⃣ static Blocks (Initialization Block)
Runs once when the class is loaded.
Used for static initialization (e.g., loading config files).
 */