package Beginner.advanced;

class Example {
    int num; // Instance variable
    String name;
    int age;

    Example(int num) {
        this("Unknown", 0); //2️⃣ Calls the parameterized constructor,avoiding repeated initialization logic

        //  num = num;  // ❌ No effect! (Local variable hides instance variable)/
        // Prints 0 (default value), not assigned value
        this.num = num;                //1️⃣ `this.num` refers to the instance variable
    }

    Example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(num + name + age);
        show(this);    // ✅ Passes the current object   //3️⃣ When Passing the Current Object as a Parameter
    }

    void show(Example obj) {
        System.out.println("Method received object: " + obj);
        //Output: If not override toString()
        // Method received object: Beginner.advanced.Example@3feba861

        //It prints the default toString() representation, which is the class name and memory address (e.g., Example@5f184fc6).
        //1. Alternative: Print Directly
        // OR
        System.out.println("Method received object: " + obj.name + obj.num);
    }

    //2. To print meaningful values, override the toString() method in your class
    @Override
    public String toString() {
        return "{num=" + num + "name=" + name + "}"; // Customize output
    }

}

public class ThisEg {
    public static void main(String[] args) {
        Example obj = new Example(10);
        obj.display(); // Output: 10
    }
}
/*
If a method parameter has the same name as an instance variable, Java gives priority to the local variable. this helps differentiate them.

It calls another constructor inside the same class, avoiding repeated initialization logic.

3️⃣ When Passing the Current Object as a Parameter
Sometimes, we need to pass the current object (this) to another method or constructor.
 */