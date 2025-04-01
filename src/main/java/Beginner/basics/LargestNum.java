package Beginner.basics;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

// 1. assigning any variable value to max & comparing
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
/* 2. assigning any variable value to max & comparing
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
*/
        System.out.println(max);

// 3. Using Math()
        max = Math.max(c, Math.max(a, b));
        System.out.println(max);

//4. Using ternary operator 2 numbers
        //       System.out.println("largest number between 2 num using ternary operator: " + ((a >= b) ? a : b));

//5. Using ternary operator for 3 numbers
        System.out.println("largest number using ternary operator: " + ((a > b) ? (a > c ? a : c) : (b > c ? b : c)));
/*
                (n1 > n2) ?
                (n1 > n3 ? n1 : n3) :
                (n2 > n3 ? n2 : n3)
 */
    }
}
