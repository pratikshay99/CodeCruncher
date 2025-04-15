package Beginner.advanced.collectionsEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MakingArrayListThreadSafe {
    public static void main(String[] args) {
     ///⚠️ Common Mistakes: Modifying list while looping:
        List<String> sl=new ArrayList<>();
        sl.add("A");
        sl.add("B");
        sl.add("A");

//        for (String s : sl) {
//            if (s.equals("A")) sl.remove(s); // ❌ ConcurrentModificationException: modifying list during iterator loop
//        }
        //if above not breaks that means using small list with one match, and loop exits before next iteration // only one "A"

     //   ✅ Correct Way Using Iterator:
        Iterator<String> it = sl.iterator();
        while (it.hasNext()){
            if(it.next().equals("A")){
                it.remove(); // ✅ safe removal
            }
        }

        ///✅ Solution 1: Use Collections.synchronizedList(...)

        List<String> list= Collections.synchronizedList(new ArrayList<>());
        // Thread-safe add
        list.add("A");
        list.add("B");
        list.add("A");

        // 👇 Iterating without synchronization
        for (String s: list){
            System.out.println(s);
        }
        /**
         ❌ If another thread modifies the list while you're iterating, this can cause:
             -ConcurrentModificationException (very common)
             -Unpredictable behavior
             -Data corruption in rare cases
         Even though:
         List<String> list = Collections.synchronizedList(...);

         -makes method calls thread-safe, the entire for-each loop is not atomic.

         for (String item : list)
        -this line Internally uses an iterator, and that iterator is not synchronized.

         -So if another thread does:
         list.add("C"); // while you're still looping
         💥  → ConcurrentModificationException
         So:
         👉 Adding/removing = safe
         👉 Iterating = needs synchronized block ✅

         ✅ Correct Way:
         */

        // Thread-safe read (outside synchronized block)
        synchronized (list){
            for (String s: list){
                System.out.println(s);
                ///if (s.equals("A")) list.remove(s); // ❌ ConcurrentModificationException 🔥 Even inside synchronized block, this fails
         //Because the iterator used by the for-each loop detects modification outside itself, even if you synchronized.
            }
        }
    /**🧠 This block locks the list while you're iterating, so no other thread can modify it during the loop.*/

    ///✅ Solution 2: Use CopyOnWriteArrayList

        CopyOnWriteArrayList<String> sc = new CopyOnWriteArrayList<>();
        sc.add("A");
        sc.add("B");

        // Safe iteration, no need to synchronize
        for (String s : sc) {
            if (s.equals("A")) sc.remove(s);
        }
        System.out.println(sc);
    }
}
/**
 ///✅ Solution 1: Use Collections.synchronizedList(...)
 ⚠️ Note:
     -You must manually synchronize block during iteration!
     -Only method calls are synchronized, not multiple operations together.
 ///✅ Solution 2: Use CopyOnWriteArrayList
     -All read operations are fast and safe
     -All write operations (add/remove) make a copy of the array
 Use CopyOnWriteArrayList when:
     -Reads are more frequent than writes
     -You want safe iteration without locking

 ✅ 3. You're using a classic for loop, not for-each:
 This doesn’t use Iterator, so no ConcurrentModificationException.
     for (int i = 0; i < list.size(); i++) {
        if (list.get(i).equals("A")) list.remove(i); // ✅ Safe if managed correctly
     }

 📌 Use when: 1. Collections.synchronizedList(...)
     -You want to share a list between threads
     -You need frequent writes/modifications
     -You don’t mind using synchronized blocks during iteration
 ⚠️ BUT:
    -You must manually synchronize during iteration to avoid ConcurrentModificationException

 ✅ 2. CopyOnWriteArrayList: 📌 Use when:
    -Your app is read-heavy, write-light
    -You want safe iteration without any locking
    -You want to avoid manual synchronized blocks
 ⚠️ BUT:
   -Each write creates a new copy → memory & performance cost
    -Avoid if frequent add/remove

 ✅ 3. Iterator with iterator().remove()📌 Use when:
    -You’re looping through any collection
    -You want to remove elements while iterating
 ⚠️ Don’t use list.remove(...) inside for-each
 */