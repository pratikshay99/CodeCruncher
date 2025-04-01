package Beginner.advanced;

public class StaticVsInstance {
    public static void main(String[] args) {
        display();
        StaticVsInstance t = new StaticVsInstance();
        t.show();
    }

    static void display() {
        System.out.println("Static...");
    }

    void show() {
        System.out.println("non static");
    }

}
