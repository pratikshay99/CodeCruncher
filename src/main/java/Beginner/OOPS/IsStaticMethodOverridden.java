package Beginner.OOPS;

class A3 {
    static void show() {
        System.out.println("A");
    }
}

class B3 extends A3 {
    static void show() {
        System.out.println("B");
    }
}


public class IsStaticMethodOverridden {
    public static void main(String[] args) {
        A3 obj = new B3();
        obj.show();  // Output: A (not B) — because static methods are not overridden!
    }
}
/*
1️⃣ Can static methods be overridden?
❌ No, they are hidden, not overridden.
If you define a static method in child with same name, it’s called method hiding — resolved by reference type, not object.
 */