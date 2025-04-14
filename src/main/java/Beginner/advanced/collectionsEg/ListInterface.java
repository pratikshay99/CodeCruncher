package Beginner.advanced.collectionsEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.add("A"));      //true
        list.add("B");                  // Add at end
        list.add("A");                  // duplicates allowed

        list.add(1, "D");                  // Add at index
        System.out.println(list);        //[A, D, B, A]

        list.get(0);                       // "A"

        list.set(1, "C");                  // Replace "B" with "C"
        System.out.println(list);        //[A, C, B, A]

        list.replaceAll(s -> s.equals("A") ? "X" : s);  //[X, C, B, X]

        list.remove(0);                   // Remove "X"
        //list.remove("X");                // removes first "X"
        //list.removeAll(Collections.singleton("X"));                   // Remove "X"
        System.out.println(list);

        list.indexOf("C");                // 0

        list.subList(0, 1);               // ["C"]
        System.out.println(list);        // [C, B, X]
        list.add(null);
        list.add(null);
        System.out.println(list);       //[C, B, X, null, null]
        //  list.get(100);            ❌ Runtime Error: IndexOutOfBoundsException
        List<String> immutable = Collections.unmodifiableList(new ArrayList<>(list));
       // immutable.add("e");      ❌ Runtime Error: UnsupportedOperationException
    }
}
/**Allows duplicates, maintains insertion order. You can access by index.
 *Common Implementations: ArrayList, LinkedList, Vector, Stack

 🧠 Interview Tip
 -set() modifies by index
 -replaceAll() is great for bulk replacement using a lambda
 -Never use add(index, value) for replacing — that shifts elements instead

 for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals("A")) {
        list.set(i, "X");
      }
  }

 ❓ Q: ArrayList vs LinkedList?
     ArrayList: fast random access, slow insertion/deletion
     LinkedList: fast insertion/deletion, slow access

 ❓What happens if you access an invalid index?
    list.get(100); ➜ IndexOutOfBoundsException

 ❓Can a List contain null values?
    Yes! (e.g., list.add(null); is valid)

 ❓Difference between list.remove(1) and list.remove("1")?
    One removes by index, the other by object — and overloaded method confusion can lead to bugs.

 ❓How do you make a List immutable?
    List<String> immutable = Collections.unmodifiableList(new ArrayList<>(list));
 */