package Beginner.Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder(s);

        System.out.println("1. Using stringBuilder inbuilt method: " + sb.reverse());

        System.out.print("2. Without inbuilt method:");
        for (int i = (s.length() - 1); i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
    /*
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    */

}
/*
1. Using stringBuilder inbuilt method: cba
2. Without inbuilt method:cba
*/