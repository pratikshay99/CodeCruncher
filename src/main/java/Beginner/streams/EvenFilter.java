package Beginner.streams;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

//filter: Use when: you want a subset of data.
public class EvenFilter {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 4, 3, 5, 6, 7, 9, 8);

        List<Integer> even = nums.stream()              //Converts List<Integer> into Stream<Integer> — sequence of elements you can process with functional-style operations (filter, map, reduce, etc.) instead of writing manual loops.
                .filter(n -> n % 2 == 0)
                .toList();
        //      .collect(Collectors.toList());

        System.out.println(even);
    }
}
/**
 * Operation	                What it does	                        Elements dropped?	        Elements changed?
 * filter(n -> n % 2 == 0)	Tests true/false, keeps only matches	Yes (odd ones removed)	    No (values unchanged)
 * map(n -> n * 2)	        Transforms every element	            No (all kept)	            Yes (values become new values)
 */

/**
 .collect(Collectors.toList())	                                                    .toList()
 Mutability	    Returns a mutable list (typically ArrayList) — you can add/remove from it	        Returns an immutable list — trying to modify it throws UnsupportedOperationException
 Null elements	Allows null values	                                                                Throws NullPointerException if the stream contains null
 Java version	Works since Java 8	                                                                Requires Java 16+
 */