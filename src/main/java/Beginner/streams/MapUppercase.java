package Beginner.streams;

import java.util.List;

public class MapUppercase {
    public static void main(String[] args) {
        List<String> names = List.of("Pratiksha", "Mahesh");

        //List<String> upper=names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());

        List<String> upper = names.stream().map(String::toUpperCase).toList();

        System.out.println(names);
    }
}
/**
 * .map(String::toUpperCase)
 * As you learned earlier, map transforms every element and passes along the new value (unlike filter, which only selects). Here, each string is transformed into its uppercase version.
  
 * String::toUpperCase        is a method reference — just a shorthand way of writing a lambda. It's equivalent to:

 * .map(String::toUpperCase)      // method reference
 * .map(s -> s.toUpperCase())     // equivalent lambda

 * Both mean: "for each element s, call .toUpperCase() on it, and use the result."

 * if your lambda looks like x -> x.someMethod() (calling a method on the parameter itself, no extra logic), you can usually replace it with ClassName::someMethod.
 */
