package Beginner.advanced;

class A {
    static void show() {
        System.out.println("A");
    }
}

class B extends A {
    static void show() {
        System.out.println("B");
    }
}


public class IsStaticMethodOverridden {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();  // Output: A (not B) — because static methods are not overridden!
    }
}
/*
1️⃣ Can static methods be overridden?
❌ No, they are hidden, not overridden.
If you define a static method in child with same name, it’s called method hiding — resolved by reference type, not object.
 */