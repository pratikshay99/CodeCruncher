package Beginner.advanced;

public class Computer {
    // Constructor
    Computer() {
        System.out.println("Constructor of Computer class.");
    }

    void computer_method() {
        System.out.println("Power gone! Shut down your PC soon...");
    }

    public static void main(String[] args) {
        Computer my = new Computer();
        Laptop your = new Laptop();
        my.computer_method();
        your.laptop_method();
    }
}
/**
 Constructor of Computer class.
 Constructor of Laptop class.
 Power gone! Shut down your PC soon...
 99% Battery available.
 */

