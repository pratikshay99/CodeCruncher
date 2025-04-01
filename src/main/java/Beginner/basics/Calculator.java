package Beginner.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            System.out.print("Enter operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("enter 2 numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+')
                    ans = num1 + num2;
                if (op == '-')
                    ans = num1 - num2;
                if (op == '*')
                    ans = num1 * num2;
                if (op == '%'){
                    if (num2 != 0) {
                        ans = num1 % num2;
                    }else{
                        System.out.println("Division by 0 is undefined.");
                    }
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }else{
                        System.out.println("Can't divide by 0");
                    }
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation !!!");
            }
            System.out.println(ans);
        }
    }
}
