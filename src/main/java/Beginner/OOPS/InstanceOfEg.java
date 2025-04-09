package Beginner.OOPS;

class Animal6 {
}

class Dog6 extends Animal6 {
}

public class InstanceOfEg {
    public static void main(String[] args) {
        String str = "Java";
        Animal6 a = new Dog6();

        /**Syntax: object instanceof ClassName*/

        // Check if 'a' is an Animal
        System.out.println(a instanceof Animal6);           //true

        // Check if 'a' is a Dog
        System.out.println(a instanceof Dog6);              //true

        // Check if 'a' is a String
        // System.out.println(a instanceof String);        // ❌ Compilation error

        System.out.println(str instanceof String);
        // System.out.println(str instanceof int);          // ❌ Compilation error

        //✅ Fix — Use Object Type if Needed:
        /**Now it compiles, because Object can be anything — including String.*/
        Object b = new Dog();  // Now reference is Object
        System.out.println(b instanceof String);            // ✅ false at runtime

        Object s = "java";
        System.out.println(s instanceof String);                // ✅ true
        // System.out.println(s instanceof int);               // ❌ Compilation error
        //💡 Explanation:
        //The instanceof keyword only works with reference types (i.e., classes or interfaces).
        //Primitive types like int, boolean, char, etc., are not objects, so they can't be used with instanceof
        //💡 If you're checking types for primitives, you'd typically need to use wrapper classes:
        System.out.println(s instanceof Integer); // ✅ false

        String nullCheck = null;
        System.out.println(nullCheck instanceof String);        // false
    }
}
/*
✅ Summary:
Related types	Compiles & returns true/false
Unrelated types	❌ Compilation error
Null reference	✅ Returns false

The instanceof keyword is used to check if an object is an instance of a specific class or implements a specific interface
-Compile-time check + Runtime check
-Avoids ClassCastException

1. What happens if the reference is null?
String s = null;
System.out.println(s instanceof String);  // ❌ false
➡️ instanceof returns false if the reference is null.

2. Is it type-safe?
Yes — compile-time type safety is enforced.

🧠 Pro Tip (Java 16+): Pattern Matching with instanceof
if (obj instanceof String s) {
    System.out.println(s.toUpperCase()); // no need to cast!
}

 */