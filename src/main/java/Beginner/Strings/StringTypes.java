package Beginner.Strings;

public class StringTypes {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b); // true (String pool)

        String c = new String("Hello");
        System.out.println(a == c); // false (heap vs pool)


        // String (immutable, thread safe bcz of immutable)
        String s = "Hello";
        s.concat(" World"); // returns new object, not saved
        System.out.println(s); // Hello ❌

        // StringBuffer (mutable, thread-safe in case of synchronization)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // Hello World ✅

        // StringBuilder (mutable, faster, not thread-safe)
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" Java");
        System.out.println(sb2); // Hello Java ✅
    }
}
/**
 String       → Immutable, safe but slow for many changes
 StringBuffer → Mutable, thread-safe
 StringBuilder → Mutable, fast, not thread-safe
 */