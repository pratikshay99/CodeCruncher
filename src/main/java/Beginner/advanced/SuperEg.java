package Beginner.advanced;

class Parent2 {
    int num = 10;               // Child class variable

    Parent2() {
        System.out.println("Parent Constructor");
    }

    void show() {
        System.out.println("Parent's show() method");
    }
}

class Child2 extends Parent2 {
    Child2() {
        // super(); is called automatically here by Java
//        Even though we didn't write super();, Java added it automatically.
//        So the Parent's default constructor is called first.


        //  super(); // Calls Parent's constructor
        System.out.println("Child Constructor");
    }

    void show() {
        System.out.println("Child's show() method");
        super.show();           // Calls Parent's show() method
    }

    void display() {
        System.out.println("Child num: " + num);        // Refers to Child's num
        System.out.println("Parent num: " + super.num); // Refers to Parent's num
    }
}

public class SuperEg {
    public static void main(String[] args) {
        Child2 obj = new Child2();

        obj.display();

        obj.show();
    }
}
/*
1️⃣ Uses of super in Java
Use Case						Description
Access Parent Class Variables	Used when the child class has a variable with the same name as the parent class.
Call Parent Class Methods		Used to call a method from the parent class when overridden in the child class.
Call Parent Class Constructor	Used to invoke a constructor of the parent class to reuse initialization logic.

✅ When you create an object of a child class, Java always calls the constructor of the parent class first — even if you don't write super(); manually.
If you don’t write super();, Java will automatically call the parent class's default constructor (the one with no parameters).
   -Even though we didn't write super();, Java added it automatically.
    -So the Parent's default constructor is called first.
💡 Final Summary:
-Java automatically adds super(); if you don’t write it.
-But it only works if the parent has a default (no-arg) constructor.
-If the parent has only parameterized constructors, you must write super(arguments); manually.
class Parent {
    Parent(String msg) {
        System.out.println("Parent constructor: " + msg);
    }
}
class Child extends Parent {
    Child() {
        // Java tries to insert super(); here, but Parent doesn't have default constructor ❌
        System.out.println("Child constructor");
    }
}

❌ This gives compile-time error:
Constructor call must be the first statement in a constructor
✅ Fix it by calling the correct constructor:

class Child extends Parent {
    Child() {
        super("Hello"); // ✅ Now we call the correct parent constructor
        System.out.println("Child constructor");
    }
}
 */