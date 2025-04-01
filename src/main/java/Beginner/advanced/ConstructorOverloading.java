package Beginner.advanced;

public class ConstructorOverloading {
    ConstructorOverloading() {
        System.out.println("Default constructor");
    }

    String lang;

    ConstructorOverloading(String s) {
        this.lang = s;
        System.out.println("Constructor Overloading: Parameterized Constructor");
    }

    public String getLang() {
        return lang;
    }

    public static void main(String[] args) {
        ConstructorOverloading dc = new ConstructorOverloading();
        ConstructorOverloading co = new ConstructorOverloading("Java");
        System.out.println(co.getLang());
    }
}
/*
Op:
Default constructor
Constructor Overloading: Parameterized Constructor
Java
 */