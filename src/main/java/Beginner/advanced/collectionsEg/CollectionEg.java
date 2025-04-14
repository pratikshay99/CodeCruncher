package Beginner.advanced.collectionsEg;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionEg {
    public static void main(String[] args) {
        Collection<String> list = new ArrayDeque<>();
        list.add("A");
        list.addAll(List.of("B","C","B","D","B"));          //[A, B, C]
        System.out.println(list);
        list.remove("B");                                //[A, C, B, D, B]
        System.out.println(list.contains("A"));         // true
        System.out.println(list.size());                // 2
        System.out.println(list.isEmpty());             // false
        list.removeAll(Collections.singleton("B"));   //[A, C, D]
        /**
         list.removeAll(Arrays.asList("B")); // creates a List
         //Collections.singleton("B") uses less memory and is immutable, which is safer.
         * */
        System.out.println(list);
        list.clear();               // Empty collection  []
        System.out.println(list);
    }
}
/*
Q: What happens if you try to modify the set returned by Collections.singleton("B")?
-It throws UnsupportedOperationException because it's immutable.
 */