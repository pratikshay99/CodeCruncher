package basics;

import java.util.Arrays;
import java.util.List;

public class ForEachLambdaRefernce {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        //using method reference
        list.forEach(System.out::println);
        //using lambda expression
        list.forEach(element -> System.out.println(element));
    }
}
/**
 * Method reference vs lambda expression:
 * forEach: to perform an action (like printing) on each element of collection/stream, part of functional programming features introduced in Java 8.
 *
 * Method reference: list.forEach(System.out::println); ....  refers to the println method of System.out, shorthand for lambda expression, Shorter & readable,
 * list.forEach(element -> System.out.println(element));
 **/

