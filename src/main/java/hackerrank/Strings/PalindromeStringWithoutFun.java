package hackerrank.Strings;

import java.util.Scanner;

public class PalindromeStringWithoutFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        int n = A.length();
//2nd way
        for (int i = 0; i < n / 2; i++) {
            if (A.charAt(i) != A.charAt(n - i - 1)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
//3rd way:
        String str="madam";
        int left=0, right= str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println("No");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");

    }
}/*
✅ No Extra Memory (O(1) Space) → No StringBuilder or extra string creation.
        ✅ Fast Execution (O(n) Time) → Only half the string is checked.
        ✅ Optimized Early Exit → Stops checking immediately if a mismatch is found.
        ✅ More Efficient than StringBuilder.reverse() → Avoids unnecessary memory allocation.
If all characters match till the middle, it is a palindrome.

Let's check if "racecar" is a palindrome.

i (Left	     A[i]	    j 	            A[j]	Match?
Pointer)            (Right Pointer)

0	        'r'	         6	            'r'	       ✅ Yes
1	        'a'	         5	            'a'	       ✅ Yes
2	        'c'	         4	            'c'	       ✅ Yes
3	        'e'	         3	            'e'	       ✅ Yes (Middle reached)

*/
