package Beginner.basics;

public class EnhancedForLoop {
    public static void main(String a[]) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] flowers = {"Rose", "Lily", "Mogara"};
        System.out.println("Integers:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println("String:");
        for (String s : flowers) {
            System.out.print(s + " ");
        }
    }
}
