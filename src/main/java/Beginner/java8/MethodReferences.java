package Beginner.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences {
    public static void main(String[] args) {
    //1. Instance Method (Arbitrary Object)
        List<String> names = Arrays.asList("A", "B", "C");
        //list=List.of("A", "B", "C");
        names.forEach(System.out::println);           /// names.forEach(n -> System.out.println(n))

    // 2. Static Method Reference
        Function<Integer, Double> squareRoot = Math::sqrt;  /// Equivalent to: x -> Math.sqrt(x)

    //3. Instance Method Reference (Specific Object)
        String str="Hello";
        Supplier<String> supplier=str::toUpperCase;   /// Equivalent to: () -> str.toUpperCase()

    //4. Constructor Reference
        Supplier<List<String>> listSupplier = ArrayList::new; /// Equivalent to: () -> new ArrayList<>()



    }
}
/**
 -shorthand syntax for calling a method using a lambda expression.
 -improves code readability and avoids unnecessary boilerplate
 🔹 Syntax: ClassName::methodName

 Types:
 -Static: ClassName::staticMethod
 -Instance: object::instanceMethod
 -Constructor: ClassName::new
 */
