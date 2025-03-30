package hackerrank.Strings;

import java.util.Scanner;

public class PalindromeStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        //Converting ip string into StringBuilder to use inbuilt string functions
        StringBuilder s = new StringBuilder(A);

        //converting stringBuilder to string using toString() to check
        String str = s.reverse().toString();

        System.out.println(A.equals(str) ? "Yes" : "No");
    }
    //A.equals(str) compares different types (String vs. StringBuilder), so it always returns false, even if the contents are the same.
}
//Given a string , print Yes if it is a palindrome, print No otherwise.