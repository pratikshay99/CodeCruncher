package basics.Strings;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class SplitStrings {
    public static void main(String[] args) {
        String s1 = "java  is awesome";
        String[] words;
        System.out.println(Arrays.toString(s1.split(" "))); //[java, , is, awesome]
        //using java foreach loop to print elements of string array

        //handling multiple spaces:
        words = s1.split("\\s+");       // Split by one or more spaces: removes extra spaces & splits correctly

        for (String w : words) {
            System.out.println(w);
        }

        String s2 = "Apple,Banana,Grapes";

        words = s2.split(",");
        for (String w : words) {
            System.out.println(w);
        }

        //You can specify limit on how many parts string should be split into.
        System.out.println("\nSplitting with a Limit:");
        words = s2.split(",", 2);      // Split into max 2 parts
        for (String fruits : words) {
            System.out.println(fruits);
        }
        /* o/p: The second part contains the rest of the string:
                        Apple
                        Banana,Grapes
         */

        // StringTokenizer (Legacy): If you are dealing with simple delimiters (not regex), you can use StringTokenizer.
        //This method is faster but less flexible than split(), as it does not support regex
        String str = "Java,Python,C++";
        StringTokenizer tokenizer = new StringTokenizer(str, ",");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        // Using Pattern.compile().split() (Advanced Regex)
        String strnum = "one1two22three333four";
        String[] parts = Pattern.compile("\\d+").split(strnum);   //splits string wherever there are numbers

        for (String part : parts) {
            System.out.println(part);
        }
    }
}

/*
    Method	                    |    Use Case
---------------------------------------------------------------------
1. split(" ")	                |    Split by spaces
2. split(",")	                |    Split by comma
3. split("\\s+")	            |    Split by multiple spaces
4. split("\\d+")	            |    Split by numbers
5. StringTokenizer	            |    For simple delimiters
6. Pattern.compile().split()	|    Advanced regex-based splitting
7. split(",", limit)	        |    Split with a maximum number of parts

Delimiter Vs Regex
Delimiter:(Simple Splitting)
-A character or sequence used to separate parts of a string.
-mainly used in string splitting (e.g., split() method)
-splitting "apple,banana,grape" using split(",").

Regex:(Advanced Pattern Matching)
- pattern used to match, search, or manipulate text.
-Used for matching, replacing, validating, and extracting text.
-Finding all numbers in "hello 123 world 456" using \\d+.

3️⃣ When to Use What?
Use Case	                                                Use Delimiter	Use Regex
Splitting by a simple character (comma, space, etc.)	            ✅	        ❌
Handling multiple spaces ("Hello World" → ["Hello", "World"])	    ❌	        ✅ split("\\s+")
Removing numbers from a string	                                    ❌	        ✅ replaceAll("\\d+", "")
Extracting email, phone numbers, special patterns	                ❌	        ✅ Regex

Conclusion:
Use delimiters when you just need to split text based on a fixed character like a comma, space, or pipe (|).
Use regex when you need more control, such as handling multiple spaces, numbers, symbols, or patterns.
*/