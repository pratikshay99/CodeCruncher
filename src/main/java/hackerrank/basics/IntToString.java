package hackerrank.basics;

public class IntToString {
    public static void main(String[] args) {
        int n = 123;
        // Convert integer to string
        String s = Integer.toString(n);

        // Check if conversion is successful
        if (s.equals(String.valueOf(n))) {
            System.out.println("Good Job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
/*
.Q. You are given an integer, you have to convert it into a string.If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

1. The user enters 100.
2. It is stored as n = 100.
3. n is converted to a string → s = "100".
4. Verifies the conversion by checking if str.equals(String.valueOf(n)).

Since 100 == 100, it prints "Good job"

 */
