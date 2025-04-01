package Beginner.basics;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class DynamicGreeting {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in); //Pratiksha
        String name = sc.next();
        System.out.println("Hello " + name); //Hello Pratiksha
    }
}
