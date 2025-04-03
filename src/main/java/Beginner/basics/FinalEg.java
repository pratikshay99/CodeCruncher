package Beginner.basics;
class Parent {
    final int n = 100; // Constant variable
    final void show() {  // Cannot be overridden
        System.out.println("Final method in Parent");
        // n=20;   // ❌ Error: Cannot modify final variable
    }
}
class Child extends Parent {
    //void show() { System.out.println("Trying to override"); } ❌ ERROR
}
public final class FinalEg {
    void show(){
        System.out.println("yes");
    }
}

// class childF extends FinalEg {} ❌ ERROR: Cannot extend a final class

/*
The final keyword in Java is used to restrict modifications in different contexts:
1️⃣ Variables → Makes a value constant (Once a final variable is assigned, it cannot be changed).
📌 Best use case: Constants like PI, fixed limits, etc.
2️⃣ Methods → Prevents overriding in subclasses.
📌 Best use case: When you want to ensure behavior consistency across all subclasses.
3️⃣ Classes → Prevents inheritance (cannot be extended).
📌 Best use case: When you want to protect the class from modifications (e.g., String class is final).
 */