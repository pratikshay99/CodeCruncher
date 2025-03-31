package basics.Strings;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        // Using '=='
        System.out.println(str1 == str2); // true (same reference, string pool)
        System.out.println(str1 == str3); // false (different objects)

        // Using .equals()
        System.out.println(str1.equals(str2)); // true (same content)
        System.out.println(str1.equals(str3)); // true (same content)

        String str4 = "Apple";
        String str5 = "Banana";

        int result = str4.compareTo(str5);
        if (result == 0) {
            System.out.println("Both strings are equal");
        } else if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else {
            System.out.println(str1 + " comes after " + str2);
        }
    }
}
/*
1. Exact equality (== vs .equals() / equalsIgnoreCase())
2. Lexicographical order (compareTo())
3. Case-insensitive comparison (equalsIgnoreCase())

a) == :Checks reference (memory address), not actual content. Avoid using for strings!
b) .equals() :Compares the actual content of the string. Use this for proper comparison.
c) compareTo() returns:
-    0 → if both strings are equal
-    < 0 → if first string is smaller than second (alphabetically)
-    > 0 → if first string is greater than second
 */