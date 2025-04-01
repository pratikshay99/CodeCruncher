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
* */