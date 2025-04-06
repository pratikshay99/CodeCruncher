package Beginner.advanced;

/**
 * If eat() is not override(not present in child) in child then op:
     parent....
     Child...
     parent....
     Child...

 * If eat() is override in child(present in child) then op:
     Overridden in child....
     Child...
     Overridden in child....
     Child...
 */
class Animal {
    void eat() {
        System.out.println("parent....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Child...");
    }
//    void eat() {
//        System.out.println("Overridden in child....");
//    }

 /*   💡 Bonus: What if eat() was overridden in Dog?
    ➡️ Because it's overridden, Java uses runtime polymorphism to resolve it based on actual object type.
🧠 What's happening?
 Animal a = new Dog();
Even though the reference type is Animal, and at compile-time, only methods in Animal can be called...
...the actual method executed at runtime is the one from Dog (the actual object type), if it's overridden.

💡Why is this runtime polymorphism?
-Compile-time: Java only checks if eat() exists in Animal — ✅ it does.
-Runtime: JVM checks what the actual object is (Dog) → Dog's overridden method is called.
  */
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();                    // Inherited from Animal
        d.bark();                   // From Dog

        Animal a = new Dog();       // reference type: Animal | object type: Dog
        a.eat();                    // Valid — eat() is in Animal
        // a.bark();                // ❌ Compile-time error
        ((Dog) a).bark();           //If we want to access bark(), we’d need an explicit cast like:
    }
}
/*
❌ a.bark(); causes a compile-time error. Why?
-Even though a is a Dog object, the reference type is Animal, and the method bark() is not defined in Animal.
-Java allows access to only those methods that exist in the reference type (unless you downcast).
💡 Bonus: What if eat() was overridden in Dog?
➡️ Because it's overridden, Java uses runtime polymorphism to resolve it based on actual object type.
❗ But what about a.bark();?
That’s not polymorphism — that’s just an extra method in Dog which doesn’t exist in Animal. So Java won’t even compile it without a cast.
💡
Animal a = new Dog();  // Ref type: Animal | Obj type: Dog
// At compile-time:
a.eat();    // Valid: Animal has eat()
a.bark();   // ❌ Invalid: Animal has no bark()

// At runtime:
   ▶ Animal.eat(); is called since Dog didn't override it

a.eat();    --> In case of override means if child has override methodExecutes Dog’s eat() → because object is Dog

🔚 Key Interview Line:
“When the method is overridden, Java uses runtime polymorphism to execute the method from the actual object type.
But if it’s not overridden, the base class method is used — still resolved at runtime, but no polymorphism behavior takes place.”
 */