package basics.Strings;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0) {                 // or while(n != 0)
            reverse = (reverse*10)+(n % 10);
            n = n / 10;
        }
        System.out.print("Reverse: " + reverse);
    }
}
