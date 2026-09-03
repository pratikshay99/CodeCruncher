package Beginner.IQ;
//In production I'd use StringBuilder because it's simple and optimized
public class ReverseString {
    public static void main(String[] args){
        String str="pratiksha";
        StringBuilder reverse= new StringBuilder(str).reverse();
        System.out.println(reverse);

        String rev="";

        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
            //either store in rev or else direct print charAt
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println(rev);
    }
}
