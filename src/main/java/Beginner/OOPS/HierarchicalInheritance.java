package Beginner.OOPS;

class A2 {
    void methodA() {
        System.out.println("Class A method");
    }
}

class B2 extends A2 {
    void methodB() {
        System.out.println("Class B method");
    }
}

class C2 extends A2 {
    void methodC() {
        System.out.println("Class C method");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        B2 obj1 = new B2();
        obj1.methodA();  // From A
        obj1.methodB();  // From B

        C2 obj2 = new C2();
        obj2.methodA();  // From A
        obj2.methodC();  // From C
    }
}
/*
Multiple classes inherit from the same parent class.
📌 A → B,
📌 A → C

Output:
Class A method
Class B method
Class A method
Class C method
 */