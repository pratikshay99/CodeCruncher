package basics.Strings;

public class StringTrimStripEg {
    public static void main(String[] args) {
        String str = "   Hello    Java   ";
        System.out.println("Without trimming\n"+ str);
        System.out.println(str.trim());
        System.out.println(str.replaceAll("\\s+"," ").trim());      // Removes extra spaces inside
        System.out.println(str.trim().replaceAll("\\s+", " "));

        //🚀 strip() from java 11 is better if your string contains Unicode whitespace (e.g., non-breaking spaces)
        System.out.println(str.strip());
        System.out.println(str.strip().replaceAll("\\s+", " "));

    }
}
/*
Remove extra space from both end of string
**trim():
trim() removes only leading (left) and trailing (right) spaces.
Spaces inside the string (between words) remain unchanged.
If you also want to remove extra spaces between words, use regex (replaceAll())- reduces multiple spaces to a single space inside the text.

**Strip:
- more powerful than trim() because it removes Unicode whitespace as well.
🚀 strip() is better if your string contains Unicode whitespace (e.g., non-breaking spaces).

-replace("\\d+", "XYZ") does nothing because it treats "\d+" as plain text, not a regex.
-replaceAll("\\d+", "XYZ") correctly replaces all numbers because it supports regex.
 */