package Beginner.advanced.collectionsEg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionVsCollections {
    public static void main(String[] args) {
        // Collection - Interface
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println(fruits);             //[Kiwi, Apple, Banana]

        // Collections - Utility class
        // Collections.sort((List) fruits);      //also works
        Collections.sort((List<String>) fruits); // sorts the list

        System.out.println(fruits);             //[Apple, Banana, Kiwi]

    }
}
/**
  -Collection is an interface.The root interface for all collection types like List, Set, Queue etc.
  -Collections is a utility class with static methods like sort, reverse, shuffle.

 Q. Can you instantiate a Collection?
 A: No, it's an interface. You instantiate one of its implementing classes like ArrayList, HashSet, etc.
 */
