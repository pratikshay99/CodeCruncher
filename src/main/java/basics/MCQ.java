package basics;

public class MCQ {
    public static void main(String[] args) {
//        String sr = "Java String Quiz";
//        System.out.println(sr.charAt(sr.toUpperCase().length()));
        // runtime exception.Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 16 It’s because the index value starts from 0.
//
//        String s = "Java String Quiz";
//        System.out.println(s.substring(5,3));
//        //StringIndexOutOfBoundsException: end index is smaller than the start index.
//
//        String s1 = "Cat";
//        String s2 = "Cat";
//        String s3 = new String("Cat");
//        System.out.print(s1 == s2);
//        System.out.print(s1 == s3);

        //truefalse When we use double quotes to create a String, it first looks for String with the same value in the String pool. If found, then it returns the reference else it creates a new String in the pool and then returns the reference.
        //However using new operator, we force String class to create a new String object in heap space. So s1 and s2 will have reference to the same String in the pool whereas s3 will be a different object outside the pool, hence the output.
        String x = "abc";
        String y = "abc";
        x.concat(y);
        System.out.print(x);
        //x.concat(y) will create a new string but it’s not assigned to x, so the value of x is not changed.
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2);
        //false: java + operator precedence is more than == operator. So the given expression will be evaluated to “s1 == s2 is:abc” == “abc” i.e false.

        //12. How many String objects created in below statements?
        String s = "abc"; // statement 1
        String ss1 = new String("abcd"); // statement 2
//        In statement 1, “abc” is created in the String pool.
//        In statement 2, first of all “abcd” is created in the string pool. Then it’s passed as an argument to the String new operator and another string gets created in the heap memory.
//                So a total of 3 string objects gets created.

        String st1 = "abc";
        String st2 = new String("abc");
        System.out.print(st1==st2);
        System.out.println(st1==st2.intern());

        //The s1 is in the string pool whereas s2 is created in heap memory.
        //Hence s1==s2 will return false.
        //When s2.intern() method is called, it checks if there is any string with value “abc” in the pool. So it returns the reference of s1. So both s1 and s2 are pointing to the same string instance now.
        //Hence s1==s2.intern() will return true.

        String p1 = new String("java");
        String p2 = new String("JAVA");
        System.out.println(p1 = p2);
        //It will print “JAVA” because the argument inside the println() method is an assignment. So it will be treated as System.out.println("JAVA").
    }


}
