package hackerrank.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a = bufferedReader.readLine();
        bufferedReader.close();

        BigInteger number = new BigInteger(a);
        if (number.isProbablePrime(10))
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
/*
Checking for Primality: Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

isProbablePrime(10) checks whether the number is prime with a certainty level of 10.
A higher value for certainty reduces false positives.

Edge Cases Considered:
✅ Large numbers (up to 100 digits)
✅ Negative numbers (BigInteger handles this internally)
✅ Zero & One (returns "not prime")
✅ Efficient Input Handling using BufferedReader
* */
