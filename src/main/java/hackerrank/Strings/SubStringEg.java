package hackerrank.Strings;

import java.util.Scanner;

public class SubStringEg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
/*
Print the substring in the inclusive range from  to .

Sample Input
Helloworld
3 7

Sample Output
lowo

 */