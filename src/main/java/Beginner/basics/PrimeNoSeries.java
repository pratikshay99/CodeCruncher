package Beginner.basics;

import java.util.Scanner;

public class PrimeNoSeries {
    public static void main(String[] args) {
        System.out.print("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //scanner.close(); if program ends weirdly
        if (n < 2) {
            System.out.println("Please enter a positive number greater than 1.");
            return;
        }
        System.out.println("Prime numbers are : ");

        for (int i = 2; i <= n; i++) {
            int c=0;
            //for (int j = 1; j <= i; j++) { // if(c==2)
            for (int j = 2;  j <=Math.sqrt(i); j++) {
//                for (int j = 2;  j * j <= i; j++) {
                if (i % j == 0) {
                    c++;
                    break; //without break also works
                }
            }
            if(c==0){
                System.out.print(i+" ");
            }
        }
    }
}
/*
A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.

-0 is not prime because it is divisible by any number.
-1 is not considered a prime because it only has one divisor (itself), not two distinct divisors.

- sqrt(16) = 4*4 = j*j

The divisors of 16 are:

1, 2, 4, 8, and 16.
They come in pairs:

(1, 16), (2, 8), (4, 4) and (8, 2),  (16, 1)

This pairing is why we only need to check divisors up to sqrt(16) = 4 because after that, the pairs are already covered.


 */
