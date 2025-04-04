package Beginner.basics;

public class NonAccessModifiers {
    final int a = 10;              // value can’t change
    static int count = 0;          // shared by all objects
    transient int temp;           // won’t be saved in file if serialized
    volatile boolean flag = true; // always read fresh value in threads

    static void print() { }       // class-level method
    final void cannotOverride() {}// can't be overridden
    synchronized void lockMe() {} // thread-safe method
}
