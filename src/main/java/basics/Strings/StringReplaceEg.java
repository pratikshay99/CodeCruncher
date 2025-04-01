package basics.Strings;

public class StringReplaceEg {
    public static void main(String[] args) {
        String str = "hello 123 world. 123 is best.";

        System.out.println(str.replace("123", "Java"));
        System.out.println(str.replaceAll("\\d+", "Java"));
        //\\d+ matches one or more consecutive digits.
        System.out.println(str.replaceFirst("123", "Java"));
        // System.out.println(StringUtils.replace(str, "world", "Java"););

    }
}
/*
1. replace() - Replaces all occurrences of a specified character or substring.
2. replaceAll()- Replaces all substrings that match a regex pattern.
3. replaceFirst() - Replaces only 1st occurrence of a matching regex pattern
4. Using Apache Commons Lang (StringUtils.replace)

-d+ is a regular expression pattern where:
        \\d → Represents any digit (0-9).
        + → Means "one or more" occurrences of the preceding pattern (digits in this case).
So, \\d+ matches one or more consecutive digits.

🚀replace() vs replaceAll():
1️⃣replace(Replaces Exact Matches)
-(" ", "") Works Only for Single Spaces
-all spaces (single spaces) are removed.
-BUT it does not reduce multiple spaces to a single space.
2️⃣replaceAll() (Works with Regex)
-uses regex, so it can match patterns like multiple spaces.
-replaceAll("\\s+", " ") replaces any number of spaces at once.

📌 Replace a specific word	✅ replace("Java", "Python")	❌ replaceAll (Not needed)

-If you are replacing a fixed word like "Java" multiple times in a string, then replace() and replaceAll() will work the same because replace() replaces all occurrences of an exact match.
Both replace("Java", "Python") and replaceAll("Java", "Python") work identically because "Java" is a fixed word, not a regex pattern.
If you want to replace based on a pattern (like numbers, spaces, special characters, etc.), then replaceAll() is required because it supports regular expressions (regex), while replace() does not.
* */