package Beginner.OOPS;

class A4 {
    int x = 5;

}

class B4 extends A4 {
    int x = 10;

    void custom() {
        System.out.println("Custom B");
    }
}

public class CallingSubClassOnlyMethod {
    public static void main(String[] args) {
        A4 obj = new B4();
        System.out.println(obj.x);   //5
        // Fields are not polymorphic — they're resolved at compile-time via reference type. Unlike methods, no overriding happens.

        // obj.custom(); // valid?  //Compile-time error!

        //Because custom() isn’t in class A.
        //"In polymorphism, the reference type controls accessible methods. So unless you downcast, subclass-only methods can’t be accessed."
    }
}