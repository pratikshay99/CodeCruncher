package Beginner.advanced;

class Parent3 {
    void show() {
        System.out.println("Parent....");
    }
}

class Child3 extends Parent3 {
    @Override
        //not mandatory
    void show() {
        System.out.println("Child......");  // Overridden method
    }
}

public class OverridingRunTimePolymorphismDynamicBinding {
    public static void main(String[] args) {
        Parent3 obj = new Child3();
        obj.show();             //Child........
    }
}
//Child class provides a new implementation of show() → Overriding (resolved at runtime via object type).
