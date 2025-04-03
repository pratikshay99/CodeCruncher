package Beginner.basics;

class Demo {
    @Override
    protected void finalize() {
        System.out.println("Finalize method called!");
    }
}

public class Finalize {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1 = null; // Making object eligible for GC
        d2 = null;

        System.gc(); // Requesting Garbage Collection (not guaranteed)

        System.out.println("End of main method");
    }
    /*op may vary:
        Finalize method called!
        Finalize method called!
        End of main method
        2.
        End of main method
        Finalize method called!
        Finalize method called!
     */
}
/*
✔ finalize() was used for cleanup before GC but is deprecated in Java 9+.
✔ Not reliable – May never run or cause delays.
✔ Use try-with-resources or explicit close() instead
 It is called by the Garbage Collector (GC) before an object is destroyed.
It is not guaranteed to run immediately or at all.
⚠ Note: System.gc(); only requests GC, but it's not guaranteed when (or if) finalize() will run.

3️⃣ Why is finalize() Deprecated?
Unreliable – JVM decides when to run it (or may never run it).
Performance overhead – Slows down garbage collection.
Better alternatives available – Use try-with-resources or explicit close() methods for resource cleanup.
 */