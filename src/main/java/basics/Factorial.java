package basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, fact = 1;
        System.out.print("Number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n < 0)
            System.out.println("Negative number");
        else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial is : " + fact);
        }
    }
}
