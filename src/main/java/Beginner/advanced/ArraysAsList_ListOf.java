package Beginner.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList_ListOf {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("A", "B", "C");
        a.set(0, "X");           //💡 [X, B, C]
        System.out.println(a);

/*  For Arrays.asList(....)
        a.set(0, "X");      // ✅ Replaces "A" with "X"
        a.add("D");         // ❌ UnsupportedOperationException
        a.remove(1);        // ❌ UnsupportedOperationException
*/
        List<String> b = List.of("A", "B", "C");
        // b.set(1, "D"); ///❌ RunTime Error: Throws UnsupportedOperationException Immutable object is modified
        System.out.println(b);

/*  For List.of(....)
        list.set(0, "X");      // ❌ UnsupportedOperationException
        list.add("D");         // ❌ UnsupportedOperationException
        list.remove(1);        // ❌ UnsupportedOperationException
 */
        List<String> a1 = Arrays.asList("A", null, "C"); // OK
        List<String> b1 = List.of("A", null, "C");       // ❌ RunTime Error: NullPointer Exception(you are not calling/using this still error at runtime)

    }
}
