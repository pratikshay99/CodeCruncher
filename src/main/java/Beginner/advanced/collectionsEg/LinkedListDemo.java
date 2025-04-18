package Beginner.advanced.collectionsEg;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(1);                           // at end
        list.add(3);                           //[1, 3]
        list.addFirst(0);                   // [0, 1, 3]
        list.addLast(15);                   // [0, 1, 3, 15]
        list.add(1, 7);           // [0, 7, 1, 3, 15]
        System.out.println(list);

        // Get elements
        list.getFirst();            // peek at head: 0
        list.getLast();            //15
        list.get(2);              // 1: index-based (O(n))

        // Remove elements
        list.remove();            // remove first: [7, 1, 3, 15]
        list.removeFirst();       // same: [1, 3, 15]
        list.removeLast();        // remove last: [1, 3]

        // Others
        list.size();
        list.contains(10);
        list.clear();
    }
}
/**
 🔹 Performance (Compared to ArrayList):
 ---------------------------------------------
 Operation	    LinkedList	    ArrayList
 ----------------------------------------------
 get(index)	        O(n)	        O(1)
 add/remove end	    O(1)	        O(1)
 add/remove mid	    O(n)	        O(n)
 memory	            More            Less
                (due to pointers)

 🔹 Use Case:
 Use LinkedList when:
     Frequent insertions/deletions in the middle or start/end
     Don’t need fast random access

 ✅ Pro Tips:
     Use LinkedList when you need frequent insert/delete at head or tail
     Use ArrayList for random access
     LinkedList uses more memory due to node objects and pointers



 */