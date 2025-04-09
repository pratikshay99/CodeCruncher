package Beginner.OOPS;

// Abstract class
abstract class Animal2 {
    // Abstract method
    abstract void makeSound();

    // Concrete/non-abstarct method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass that extends Animal
class Dog2 extends Animal2 {
    // Must implement the abstract method
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class AbstractEg {
    public static void main(String[] args) {
        //Animal2 a = new Animal2(); //Compiler-error... 'Animal' is abstract; cannot be instantiated
        Animal2 a = new Dog2();   // Polymorphism in action
        a.makeSound();          // Output: Woof!
        a.eat();                // Output: This animal eats food.
    }
}
/*
Animal is an abstract class: It cannot be instantiated.
makeSound() is an abstract method: It must be implemented by any subclass.
eat() is a normal method, shared across all animals.
🔹 Abstract Class
-Cannot be instantiated (you can't create an object of it).
-Can have abstract methods (methods without a body) and concrete methods (with implementation).
-used when classes are similar in nature and share some common code.
🔹 Abstract Method
-Declared without a body.
-Must be overridden in the subclass (unless the subclass is also abstract).
🔸 Key Rules
Concept	      			Abstract Class
Can have constructors?					✅ Yes
Can have static methods?				✅ Yes
Can have final methods?					✅ Yes
Can implement interfaces?				✅ Yes
Can extend other classes?				✅ Yes (only one due to single inheritance)

 */