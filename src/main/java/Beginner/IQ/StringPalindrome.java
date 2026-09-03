package Beginner.IQ;

public class StringPalindrome {
    public static void main(String[] args){
        String s="madam";

        String rev= new StringBuilder(s)         //Converting 's' string into StringBuilder to use inbuilt string functions
                        .reverse().toString();

        //s.equals(rev) compares different types (String vs. StringBuilder), so it always returns false, even if the contents are the same.
        //if we don't conver .toString() then result of reverse() is of StringBuilder data type
        System.out.println(s.equals(rev));

//2nd approach
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
}
