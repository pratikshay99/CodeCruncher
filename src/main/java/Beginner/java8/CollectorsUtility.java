package Beginner.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

record Person(String name, String city) {
}

public class CollectorsUtility {
    public static void main(String[] args) {
        List<String> names = List.of("A", "B", "C", "A");
        List<String> r = names.stream().collect(Collectors.toList());// keeps duplicates
        //List<String> r= new ArrayList<>(names); //Better way for above
        System.out.println(r);              //[A, B, C, A]
        r.add("D");
        System.out.println("After modification after using Collectors: " + r); //[A, B, C, A, D]

        Set<String> s = names.stream().collect(Collectors.toSet());
        System.out.println(s);                              //[A, B, C]
        s.add("E");
        System.out.println("After modification after using Collectors: " + s);//[A, B, C, E]

        List<String> rs = names.stream().toList();// keeps duplicates
        //  rs.add("F");//❌ RunTime Error
        //Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println("After modification after using stream.toList(): " + rs);

        //🔸 joining()
        List<String> n = List.of("Pratiksha", "A", "B");
        String join = n.stream().collect(Collectors.joining(", "));
        //String join= String.join(", ", n);
        System.out.println(join);               //op: Pratiksha, A, B

        List<Person> people = List.of(new Person("Pratiksha", "Pune"),
                new Person("Meenakshi", "Bihar"),
                new Person("Shreyasi", "Pune"));

        System.out.println(people.stream().collect(Collectors.groupingBy(Person::city)));
        //{Bihar=[Person[name=Meenakshi, city=Bihar]], Pune=[Person[name=Pratiksha, city=Pune], Person[name=Shreyasi, city=Pune]]}

        //➡ This will group people by city and give a list of names instead of full objects.
        //using lambda
        System.out.println(
                people.stream()
                        .collect(Collectors.groupingBy(
                                p -> p.city(),
                                Collectors.mapping(p -> p.name(), Collectors.toList())
                        ))
        );
        //using method reference
        System.out.println(
                people.stream()
                        .collect(Collectors.groupingBy(
                                Person::city,
                                Collectors.mapping(Person::name, Collectors.toList())
                        ))
        );
        //{Bihar=[Meenakshi], Pune=[Pratiksha, Shreyasi]}
    }
}
/***
 🔹 Stream.toList() (Java 16 onwards):
        e.g. List<String> result = stream.toList();
     -Returns an immutable list
     -Immutable list: You cannot add(), remove() to it
     -Throws UnsupportedOperationException if you try to modify
 🔹 Collectors.toList()
        e.g. List<String> result = stream.collect(Collectors.toList());
     -Returns a mutable list – you can modify it later
     -Supported since Java 8
     -Works well in collector chaining (e.g., with groupingBy(), mapping())
 */
