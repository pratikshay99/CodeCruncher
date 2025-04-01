package Beginner.basics;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp = n, rem = 0, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
/*
ArmStrong = sum of its digits each raised to the power of the number of digits is equal to the number itself.
153 -> 1^3 + 5^3 + 3^3 = 153 ✅
 */