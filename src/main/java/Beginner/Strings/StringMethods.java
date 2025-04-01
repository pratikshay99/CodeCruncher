package Beginner.Strings;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello java", t = "world";
        System.out.println("Number of characters = " + s.length());
        String concatenated = s.concat(t);
        System.out.println(s.concat(" world"));
        System.out.println(s.replace("Hello", "Hey"));
    }
}
