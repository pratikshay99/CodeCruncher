package Beginner.OOPS;

class A1 {
    void methodA() {
        System.out.println("Class A method");
    }
}

class B1 extends A1 {
    void methodB() {
        System.out.println("Class B method");
    }
}

class C1 extends B1 {
    void methodC() {
        System.out.println("Class C method");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C1 obj = new C1();  //child
        obj.methodA();      // From A
        obj.methodB();      // From B
        obj.methodC();      // From C
    }
}
/*
One class inherits from another, which itself inherits from another.
📌 A → B → C
 */
