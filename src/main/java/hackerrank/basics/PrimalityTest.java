package hackerrank.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        bufferedReader.close();

        int n = Integer.parseInt(a);
        //    BigInteger bigInt = new BigInteger(a);
        //    bigInt.isProbablePrime(10);
        if (n < 2) {
            System.out.println("Enter enter a positive number greater than 1 ");
            return;
        }

        int c = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                c++;
                break;
            }
        }
        if (c == 0)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
