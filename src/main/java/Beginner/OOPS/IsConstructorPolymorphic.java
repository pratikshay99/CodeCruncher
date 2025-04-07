package Beginner.OOPS;

class Parent5 {
    Parent5() {
        System.out.println("Parent constructor");
    }
}

class Child5 extends Parent5 {
    Child5() {
        System.out.println("Child constructor");
    }
}

public class IsConstructorPolymorphic {
    public static void main(String[] args) {
        Parent5 obj = new Child5(); // which constructor runs?
        //But this is not polymorphism. Java is not calling the constructor based on obj’s type — it simply runs both constructors during object creation.
    }
    /*Output:
        Parent constructor
        Child constructor*/
}
/*
🚫 Constructors Can’t Be Overridden — That’s Why They’re Not Polymorphic
Because constructors are not inherited, and overriding requires inheritance + same method signature + different behavior.
Resolved at	-> method for Runtime (for overridden) -> constructor at Compile-time
“Constructors support overloading but not overriding, so they are not polymorphic.”
We mean:
-You can have multiple constructors in a class (overloading ✅)
-But you cannot override a constructor in a subclass — no runtime polymorphism there ❌

✅ Overriding = Polymorphism
❌ Constructors can’t be overridden
➡️ Therefore, constructors ≠ polymorphic
 */
