package Beginner.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/// ❓ From a list of integers, get even numbers, square them, and collect into a new list.
public class StreamAPIWithOrWithout {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evenSquares = new ArrayList<>();

        //🚫 Without Stream API (Traditional Approach)
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                evenSquares.add(n * n);
            }
        }
        System.out.println(evenSquares);
        //✅ With Stream API (Modern Java 8+)👉:

        List<Integer> evenSquaresS = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(evenSquaresS);
    }
}
/**
 * 🚫 Without Stream API (Traditional Approach)👉 Explanation:
      -Manual iteration
      -Condition inside loop
      -Result added manually to new list

 * ✅ With Stream API (Modern Java 8+)👉 Explanation:
      -stream() starts stream pipeline
      -filter() keeps only even numbers
      -map() transforms each to its square
      -collect() gathers results into a list
*/