package Beginner.basics;

/**Output:
     Static block executed!
     Constructor
     Method
 */
class STBE {
    STBE() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static block executed!");
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
*/