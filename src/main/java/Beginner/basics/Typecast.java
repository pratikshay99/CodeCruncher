package Beginner.basics;

class Animal {
    public Animal() {
        System.out.println("Animal Parent Constructor");
    }

    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("Dog Child Constructor");
    }

    void bark() {
        System.out.println("Barking");
    }
}

public class Typecast {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting (Child → Parent)
        /**op:
         Animal Parent Constructor
         Dog Child Constructor
         **/

        a.makeSound(); // ✅ Allowed

        Dog dg = (Dog) a; // ✅ Downcasting (Parent → Child)
        dg.bark(); // Works because 'a' was originally a Dog

        /** if    Animal a = new Animal ();
                  Dog dg = (Dog) a;
         then     dg.bark();    ❌will not work, runtime error: Animal class cannot be cast to class Dog
         **/

        // a.bark(); // ❌ Not allowed(Parent reference doesn't have 'bark()') compile time error

        //✔ Requires explicit casting: (Dog) a
        //✔ Works only if the object was originally a Dog
        //✔ Use instanceof to avoid ClassCastException

        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.bark();
        }

//Below gives compile-time error bcz Animal doesn't necessarily contain Dog's specific properties/methods.
        //  Dog d = new Animal(); // ❌ Not allowed (Parent cannot be assigned to Child directly)

    }
}
/*
Above output:
Animal Parent Constructor
Dog Child Constructor
Animal Sound
Barking
Barking

✔ Widening (Implicit) → Safe, automatic, no data loss
✔ Narrowing (Explicit) → Requires manual casting, possible data loss
✔ Wrapper Class Casting → Using .valueOf() and .xxxValue() methods
✔ Object Casting (Upcasting & Downcasting) → Used in Inheritance

When dealing with inheritance, we can cast a child class object to a parent class (Upcasting) or convert it back (Downcasting).
🔹 Upcasting (Implicit, Safe)
🔹 Downcasting (Explicit, Risky - Needs Check)
Downcasting means converting a parent class reference back to a child class object.

✔ instanceof check to prevent ClassCastException
 */