package Beginner.basics;

/**
 * Output:
 * Static block executed!
 * Constructor
 * Method
 */
class STBE {
    int n = 10;

    STBE() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static block executed!");
        // System.out.println(n);        // ❌ Compilation Error

        /*
     Why does it fail?
        A static block belongs to the class level, while y is an instance variable (belongs to objects).
        A static block cannot access non-static variables directly because instance variables do not exist until an
        object is created.
        How to fix it?
        If you really need to access y, you must create an instance inside the static block:
         */
        STBE ob = new STBE();
        System.out.println(ob.n);
    }

    void display() {
        System.out.println("Method");
    }
}

public class StaticBlockEg {
    public static void main(String[] args) {
        STBE obj = new STBE(); // Static block runs first
        obj.display();
    }
}
/*
3️⃣ static Blocks (Initialization Block)
-Runs once when the class is loaded.
-Used for static initialization (e.g., loading config files).
📌 Best use case: Setting up static configurations before objects are created.

Key Takeaways
✔ static Variables → Shared across all objects.
✔ static Methods → Can be called without an object.
✔ static Blocks → Runs once when class loads.
✔ static Classes → Inner classes that don’t need an instance.


Why does it fail?
        A static block belongs to the class level, while y is an instance variable (belongs to objects).
        A static block cannot access non-static variables directly because instance variables do not exist until an
        object is created.
        How to fix it?
        If you really need to access y, you must create an instance inside the static block:
*/