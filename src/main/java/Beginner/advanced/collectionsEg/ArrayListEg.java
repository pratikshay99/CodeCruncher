package Beginner.advanced.collectionsEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEg {
    public static void main(String[] args) {
        // 1. Creating an ArrayList (Default capacity is 10)
        ArrayList<String> students = new ArrayList<>();
        //students.ensureCapacity(50);  // Avoids resizing multiple times 5. ⚙️ Use ensureCapacity(n) if size is known early

        // 2. add(E e) - Adding elements
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        // 3. add(index, element) - Inserting at a specific index
        students.add(1, "David");  // Insert David at index 1

        // 4. get(index) - Accessing elements
        System.out.println("Student at index 2: " + students.get(2)); // Bob

        // 5. set(index, element) - Updating an element
        students.set(2, "Brian");  // Replaces "Bob" with "Brian"

        // 6. remove(index) - Removing by index
        students.remove(0);  // Removes "Alice"

        // 7. remove(Object o) - Removing by object
        students.remove("Charlie");

        // 8. contains(Object o) - Checking existence
        System.out.println("Has David? " + students.contains("David")); // true

        // 9. indexOf(Object o)
        System.out.println("Index of Brian: " + students.indexOf("Brian"));
        System.out.println("Index of Charlie: " + students.indexOf("Charlie")); //-1

        // 10. size() - Number of elements
        System.out.println("Total students: " + students.size());

        // 11. isEmpty()
        System.out.println("Is list empty? " + students.isEmpty());

        // 12. Iterating (Java 8+)
        students.forEach(System.out::println);

        // 13. trimToSize() - Optional: reduces capacity to size
        students.trimToSize(); // Good practice if no more additions expected

        // 14. clear()
        students.clear(); // Removes all elements

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("A" + i); // Adds 100 elements
        }
        for (int i = 0; i < 90; i++) {
            list.remove(0); // Now only 10 elements left
        }

// Internally, capacity is still enough for 100 elements
// But only 10 are used. trimToSize() will reclaim that memory.
        list.trimToSize();
//"What if I add more items after trimToSize()?", It’ll resize again just like usual — no error, just performance cost due to array copy.

        //same eg like ListInterface
        //🔐 Thread-Safety: ❌ ArrayList is not thread-safe. ArrayList is not synchronized → Use Collections.synchronizedList() or CopyOnWriteArrayList in multi-threading.
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("A");

    }
}
/***
 2. ❌ Assuming remove(Object o) and remove(int index) are same
 list.remove(1);        // Removes element at index 1 → "2"
 list.remove("3");      // Removes element "3"
 🧠 Tip: Overloaded methods — always be aware of parameter type.

 🤔 After list.remove(1); — What happens to the list?

 ArrayList<String> list = new ArrayList<>();
 list.add("1");      // index 0
 list.add("2");      // index 1
 list.add("3");      // index 2

 list.remove(1);     // Removes element at index 1 → "2"
 ➡️ After that removal, the list becomes:

 Index   Value
 0       "1"
 1       "3"
 ✅ The element at index 2 ("3") shifts left to index 1.

 💡 Does it leave a null or empty spot?
 No! ArrayList does not leave nulls or empty spaces. It shifts elements to maintain order and reduce the size.
 That’s why ArrayList removal from the middle is O(n) — because all elements after the removed index must shift left one position.

 🔧 Internal Behind-the-Scenes:
 Internally, ArrayList is backed by an Object[] array.

 After removal:
 System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
 It shifts all elements after the removed index to the left, and then sets the last index to null to avoid memory leaks.

 ✅ Final State of the list
 list = ["1", "3"]
 list.size() == 2
 TL;DR
 -remove(index) shifts elements left to fill the gap.

 -No empty space or null is left at that index.

 -ArrayList always keeps elements contiguous from index 0 to size-1.
 */