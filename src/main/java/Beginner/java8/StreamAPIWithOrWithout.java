package Beginner.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/// ❓ From a list of integers, get even numbers, square them, and collect into a new list.
public class StreamAPIWithOrWithout {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 2, 1, 4, 5, 6);

        System.out.println(numbers.stream().sorted().collect(Collectors.toList())); //eeuivalent: numbers.stream().sorted().toList()
        //[1, 2, 3, 4, 5, 6]

        System.out.println(numbers.stream().limit(3).toList()); // First 3 items
        System.out.println(numbers.stream().skip(2).toList());  // Skip first 2


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

    /// ❓Get square of even numbers from list and return a comma-separated String.
        List<Integer> num = List.of(1, 2, 3, 4, 5, 6);

        String result = num.stream()
                .filter(n -> n % 2 == 0)              // 2, 4, 6
                .map(n -> n * n)                      // 4, 16, 36
                .map(String::valueOf)                // "4", "16", "36"
                .collect(Collectors.joining(", "));  // "4, 16, 36"

        System.out.println(result);
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