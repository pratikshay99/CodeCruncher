package Beginner.OOPS;

interface A5 {
    default void show() {
        System.out.println("A");
    }
    static void staticMethod(){
        System.out.println("A");
    }
}

interface B5 {
    default void show() {
        System.out.println("B");
    }
    static void staticMethod(){
        System.out.println("A");
    }
}

public class InterfaceForMultipleInheSupport implements A5, B5 {
    @Override
    public void show() {
        // Resolving the ambiguity manually
        A5.super.show();   // Or B.super.show();
        B5.super.show();
        System.out.println("C's own show");
        System.out.println("Custom implementation"); //🔥If both interfaces have same method, you must override it. No ambiguity.”

        A5.staticMethod();   // ✅No conflict, Called via interface name
        B5.staticMethod();   // ✅ Called via interface name
    }
}

/*
Java allows multiple inheritance using interfaces.
If two interfaces have same default method, the class must override it and manually resolve the conflict using InterfaceName.super.method().
❓ Can you override and only call one interface’s method?
✅ Yes! You can call only A5.super.show() and skip B5 if needed.
❓ What if one interface has default and one has abstract method?
✅ No ambiguity. You just override the abstract one, or use the default
❓ What happens if both have static methods with same name?
✅ No conflict. Static methods are called via interface name: A5.showStatic()

Only static methods can be called using the interface (or class) name directly.

❓ Can we call A5.show(); instead of A5.super.show();?
🚫 No
🔍 Why?
A5.show(); would only work if show() were static in the interface.
But here, show() is a default method (i.e., instance method in interface).
Default methods must be called via object or via InterfaceName.super.method() inside the implementing class.
 */