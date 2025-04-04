package Beginner.advanced;

class Outer {
    static class Inner {
        void display() {
            System.out.println("Static Inner Class");
        }

        static void staticMethod() {
            System.out.println("Static inside Static inner Class");
        }
    }
}

public class StaticNestedClassEg {
    public static void main(String[] args) {
        // No need to create Outer object
        Outer.Inner obj = new Outer.Inner(); // ✅ Direct access
        // 🔥 We create object because `display()` is NOT static
        obj.display();

        Outer.Inner.staticMethod(); //✅ Direct access no need of object as it is static method itself
    }
}
/*
Op:
Static Inner Class
Static inside Static inner Class
---------------------------------------------------------------------------------------------------
4️⃣ static Nested Classes (Static Inner Classes)
A static class inside another class that does not require an outer class instance.
✅ Since ineer class is static, don’t need to create object of outer class to use inner class.

📌 Best use case: Helper classes (e.g., Map.Entry in Java Collections).
--------------------------------------------------------------------------------------------------
🧠 Analogy:
Imagine you have a toolbox (Outer class).
Inside it, there’s a screwdriver (Inner class).
A static nested class means:
You can take the screwdriver directly, without opening the whole toolbox.
--------------------------------------------------------------------------------------------
Map.Entry<K,V>  // This is a static nested class inside Map interface
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
No need to create a Map object to use Entry.
Can access outer class’s non-static members?	❌ No
-------------------------------------------------------------------------------------------------
🔥 Static methods or static variables can be accessed without creating an object.
Math.sqrt(25);         // ✅ static method from Math class
SomeClass.staticVar;   // ✅ static variable
😕 But why do we still write:
Outer.Inner obj = new Outer.Inner();
Isn't Inner static?
✅ Here's the key difference:
A static nested class means:
It can be created without an instance of the outer class.
But it’s still a class — and like any class, to use its non-static methods, you need to create an object.
 */