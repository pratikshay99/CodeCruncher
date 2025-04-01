package Beginner.basics;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * char ch = in.nextChar();
         * In java nextChar() method is not present, so To read a char, we've to use next().charAt(0).
         * next() function returns the next token/word in the input as a string
         * charAt(0) function returns the first character in that string
         * number 0 in function in CharAt(NUMBER) represents the index of the single word of the string taken input, and set that index character to the char variable
         *  trim() -> leading & trailing space removed in string
         */
        // char ch = in.next().charAt(0);
        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

        //with Ascii value
        if (ch >= 97 && ch <= (97 + 26)) {  //z=122
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase"); //Ascii value of A-> 65
        }

    }
}
