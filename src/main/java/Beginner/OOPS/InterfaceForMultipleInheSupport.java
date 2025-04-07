package Beginner.OOPS;

interface A5 {
    void show() {
        System.out.println("A");
    }
}

interface B5 {
    void display();
}

public class InterfaceForMultipleInheSupport implements A5, B5 {
}
