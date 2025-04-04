package Beginner.advanced;

class Parent1 {
    static void staticMethod() {
        System.out.println("Parent's Static Method");
    }
}

class Child1 extends Parent1 {
    static void staticMethod() {
        System.out.println("Child's Static Method");
    }
}

public class HidingCompileTimeBinding {
    public static void main(String[] args) {
        Parent1 obj = new Child1(); // Parent reference, Child object
        obj.staticMethod(); // ❗ Calls Parent's method (Compile-Time Binding)
        //Op: Parent's Static Method
    }
}
/*
📌 Why?
-staticMethod() is a static method, meaning it is resolved based on the reference type (Parent), not the actual object (Child).
-Since obj is declared as Parent obj, it calls Parent's static method, NOT Child's.
-This is called method hiding, NOT overriding.
Static methods are hidden (Compile-time Binding).
❌ Method is resolved at compile-time based on the reference type.
 */