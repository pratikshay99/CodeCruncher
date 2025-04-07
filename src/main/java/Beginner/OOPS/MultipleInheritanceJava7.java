package Beginner.OOPS;

abstract class Animals {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

abstract class Bird {
    void sound() {
        System.out.println("Bird chirps");
    }
}

// Java doesn't support multiple inheritance with classes directly,
// So we use composition to simulate it
public class MultipleInheritanceJava7 {
    Animals animal = new Animals() {
    };  // Anonymous inner class
    Bird bird = new Bird() {
    };          // Anonymous inner class

    void sound() {
        animal.sound();
        bird.sound();
        System.out.println("Combined sound from MultipleInheritanceExample");
    }

    public static void main(String[] args) {
        MultipleInheritanceJava7 obj = new MultipleInheritanceJava7();
        obj.sound();
    }
}
/*
Composition means “HAS-A” relationship, where a class contains an object of another class instead of extending it.
💡 Instead of saying "Class A is a B" (which is inheritance),
We say "Class A has a B" — that's composition.
*/
