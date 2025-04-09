package Beginner.Strings;

import java.util.ArrayList;
import java.util.List;

public class StringTypes {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b); // true (String pool)

        String c = new String("Hello");
        System.out.println(a == c); // false (heap vs pool)


        // String (immutable, thread safe bcz of immutable)
        String s = "Hiii";
        s = "Hello";
        s.concat(" World"); // returns new object, not saved
        System.out.println(s); // Hello

        // StringBuffer (mutable, thread-safe in case of synchronization)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // Hello World ✅

        // StringBuilder (mutable, faster, not thread-safe)
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" Java");
        sb2 = new StringBuilder("Python"); //allow
        System.out.println(sb2); // Hello Java ✅
        /** ❓Can We Use final With String?
                Yes, it prevents reference reassignment but does not prevent modification (for mutable objects)
         **/

    /**
        final String name = "Java";
        name = "Python"; // Compilation error

    */

    /**
        final StringBuilder sb1 = new StringBuilder("Java");
        sb1.append(" Developer"); // ✅ Allowed: modifying the object
        System.out.println(sb); // Java Developer

        sb1 = new StringBuilder("Python"); // ❌ Compilation Error! (final) prevents reference reassignment
    */

    /**
        final List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        System.out.println(list); // [Java, Python]

        list = new ArrayList<>(); // ❌ Compilation error (reference can't be reassigned)
    */
    }
}
/**
 * String       → Immutable, safe but slow for many changes
 * StringBuffer → Mutable, thread-safe
 * StringBuilder → Mutable, fast, not thread-safe
 */

/**
  sb.append(...)	            ✅ Yes	You're modifying the object — and StringBuilder is mutable
  sb = new StringBuilder(...)	❌ No	sb is final, so you can’t reassign the reference
 *
 📌 Key Concept:
     final → locks the reference, not the contents
     StringBuilder → is mutable, so we can modify its content
     But we can't reassign the final variable to a new StringBuilder object
 */