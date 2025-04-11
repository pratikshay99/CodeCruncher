package Beginner.java8;

import Beginner.advanced.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaExpressions {
    public static void main(String[] args) {
        /**❓ Example: Iterating and Printing a List*/

        /** 🔸 Without Lambda (Pre-Java 8)*/
        List<String> list = Arrays.asList("Java", "Spring", "Angular");
        for (String s : list) {
            System.out.println(s);
        }
        /** 🔹 With Lambda (Java 8+)*/
        System.out.println("Using lambda Expression");
        list.forEach(s -> System.out.println(s));

        System.out.println("Using lambda Expression");
        list.forEach(System.out::println); //📌Lambda can be replaced with method reference

        /**❓ Example: Sorting with Comparator*/
        /** 🔸 Without Lambda (Pre-Java 8)*/
        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        /** 🔹 With Lambda (Java 8+)*/
        Collections.sort(list, (a, b) -> a.compareTo(b));
        System.out.println(list);


        /**❓🔹Example in Spring Boot Context:

                 List<Employee> employees = getEmployees();
                 List<Employee> filtered = employees
                 .stream().
                 filter(emp -> emp.getSalary() > 5000)
                 .toList();
         */

        /**❓ Example: Functional vs Imperative*/

/**🔸 Imperative Style (Traditional Java)*/
        System.out.println("Printing name starts with from List of array");

        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "Accha");
        List<String> result = new ArrayList<>();

        for (String s : names) {
            if (s.startsWith("A")) {
                result.add(s.toUpperCase());
            }
        }
        System.out.println(result);
        /**🔹 Functional Style (Java 8+)*/

        List<String> results = names
                .stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(results);

         /*✅Example:Custom Functional Interface
🔸Without Lambda:
        Greeting greet = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello, " + name);
            }
        };

🔹With Lambda:
        Greeting greet = name -> System.out.println("Hello, " + name);
       */
    }
}
