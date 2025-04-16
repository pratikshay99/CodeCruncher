package Beginner.advanced.collectionsEg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetEg {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Santra");
        set.add("Apple");  // Duplicate, ignored
        set.add("Orange");
        System.out.println(set); // Output: [Apple, Orange, Banana, Santra] (order may vary)

        Set<String> sets = new HashSet<>();
        sets.add("Hello");
        sets.add(new String("Hello")); // Duplicate because equals() returns true
        System.out.println(sets.size()); // 1
/***
 🧠 Conceptual Depth: What Makes an Element "Duplicate"?
         A Set relies on logical equality, not reference equality.
         So two different objects with the same content (as defined by equals()) are considered duplicates
 */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4));

        set1.addAll(set2);       // Union: [1, 2, 3, 4] //sout:true
        System.out.println(set1);
//set1.addAll(set2);  is modifying original elements in set1, so below output given assuming based on original set, real op should be diff based on updated set1
        set1.retainAll(set2);    // Intersection: [3]
        set1.removeAll(set2);    // Difference: [1, 2]

      /**Understanding uniqueness*/
        String a = "Hello";                          // Stored in String Pool
        String b = new String("Hello");      // Stored in Heap
        System.out.println(a == b);                 // false
        System.out.println(a.equals(b));            // true
        System.out.println("hash of a "+a.hashCode());           // Same hash
        System.out.println("hash of b "+b.hashCode());           // Same hash
        //➡️ HashSet detects them as logically the same, so it doesn't add the second one.

/***
     s1 == s2 → ❌ false (different memory addresses)
     s1.equals(s2) → ✅ true (same content)
     Because String overrides equals() to compare content, not memory.
 */
     /**🔹How HashSet Works Internally*/
        Set<String> setu = new HashSet<>();
        setu.add("Hello");             // Step A
        setu.add(new String("Hello")); // Step B

    /** Behind the scenes:
         HashSet uses a HashMap internally, so when you add():
         1. It calls hashCode() on the object.
         2. It uses the hash to find a bucket.
         3. Then it uses equals() to check if an equivalent object already exists.
         ➡️ If any object with the same hash code and content (via equals) exists, it rejects the new one as a duplicate.

     🎯Even if the second "Hello" is a completely new object, it's considered a duplicate because:
            new String("Hello").equals("Hello") == true
     * */
    }
}
/*
Method                      | Purpose
add(E e)                    | Adds an element if not already present
remove(Object o)            | Removes a specific element
contains(Object o)          | Checks if element exists
size()                      | Returns number of unique elements
iterator()                  | For traversing the Set
clear()                     | Empties the set
addAll(Collection c)        | Union of two sets
retainAll(Collection c)     | Intersection
removeAll(Collection c)     | Difference
equals(Object o)            | Compares two sets
isEmpty()                   | Checks if set is empty

🚨 Common Developer Mistakes
Mistake	-> Why it matters
Not overriding equals() and hashCode() in custom objects ->	Causes unexpected duplicates in Set
Using mutable objects in a Set -> Can break internal integrity; the Set may "lose" the object
Assuming order in a Set ->	Order is not guaranteed unless specified by the implementation

⚖️ Mathematical Set Operations
Though Java's Set API doesn't have direct methods like union(), you can easily implement them using addAll(), retainAll(), and removeAll():

🎯Even if the second "Hello" is a completely new object, it's considered a duplicate because:
            new String("Hello").equals("Hello") == true
 */