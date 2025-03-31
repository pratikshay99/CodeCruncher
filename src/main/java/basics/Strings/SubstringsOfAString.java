package basics.Strings;

import java.util.Scanner;

public class SubstringsOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings");
        String s = sc.next();

//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j <= s.length(); j++) {
//                System.out.println(s.substring(i, j));
//            }
//        }
        /*or inner loop can also be
         for (int j = i; j < n; j++) {
            System.out.println(str.substring(i, j + 1));
          }
        * */
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                System.out.println(s.substring(i, j + 1));
            }

        }

    }
}
/*
ip: abc
Output:
        a
        ab
        abc
        b
        bc
        c
*/
