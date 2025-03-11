package hackerrank.basics;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNext()) {
            i++;
            System.out.println(i + " " + sc.nextLine());
        }
    }
}
/**
 * https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true

 * Sample Input
 *
 * Hello world
 * I am a file
 * Read me until end-of-file.
 * Sample Output
 *
 * 1 Hello world
 * 2 I am a file
 * 3 Read me until end-of-file.
 */

