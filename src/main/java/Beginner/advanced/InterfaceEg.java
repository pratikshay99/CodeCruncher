package Beginner.advanced;

interface Vehicle {
    // 1. abstract method (default in interfaces)
    void start();

    // 2. default method (Java 8+)
    default void fuelType() {
        System.out.println("Uses petrol or diesel.");
    }

    // 3. static method (Java 8+)
    static void category() {
        System.out.println("This is a land vehicle.");
    }

    // 4. constant field (public static final by default)
    int MAX_SPEED = 120;

    // 5. private method (Java 9+)
    private void internalCheck() {
        System.out.println("Internal check complete.");
    }

    // 6. default method calling private method
    default void performCheck() {
        internalCheck(); // works internally
        System.out.println("Ready to drive!");
    }
}
// Class implementing the interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started.");
    }

    // Optional: override default method
    public void fuelType() {
        System.out.println("Uses petrol.");
    }
}
public class InterfaceEg {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();           // Car started.
        myCar.fuelType();        // Uses petrol.
        myCar.performCheck();    // Internal check complete. Ready to drive!
        //mycar.internalCheck()   //compilation error: private method

        // Access static method from interface
        Vehicle.category();      // This is a land vehicle.

        // Access constant
        System.out.println("Max speed: " + Vehicle.MAX_SPEED); // 120
    }
}
