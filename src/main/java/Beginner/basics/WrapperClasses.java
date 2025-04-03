package Beginner.basics;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = num; // Autoboxing (int → Integer)

        ArrayList<Integer> list = new ArrayList<>();
        list.add(num);      // Autoboxing in Collections
        System.out.println(obj);  // Output: 10
        System.out.println(list.get(0)); // Output: 10

        Integer object = Integer.valueOf(20);
        int intNum = object; // Unboxing (Integer → int)

        System.out.println(intNum); // Output: 20

        Integer obj1 = 30;  // Autoboxing
        int sum = obj1 + 10; // Unboxing (Integer → int) then addition

        System.out.println(sum); // Output: 40

        //TypeCasting with Wrapper Class
        Integer obj2 = Integer.valueOf(100);
        int number = obj2.intValue(); // Unboxing (Object to primitive)
    }
}
/*
Wrapper Classes:
-convert primitive data types into objects.
-provide way to use primitives in object-oriented contexts where objects are required, such as collections, serialization, and multithreading.
-✔ Useful in Collections: ArrayList<Integer> instead of int[]
✔ Provides Utility Methods: Integer.parseInt("123"), Double.valueOf("3.14"), etc.

1. Autoboxing (Primitive → Wrapper Object)
✅ Automatically converts a primitive into its Wrapper class
✅ Occurs when storing primitives in collections (e.g., ArrayList<Integer>)

2. Unboxing (Wrapper Object → Primitive)
✅ Automatically converts a Wrapper object into its primitive type
✅ Occurs when extracting values from collections or performing calculations

Java allows seamless calculations between primitives and wrapper objects.

✔ Simplifies code by removing explicit conversion
✔ Enhances readability & reduces boilerplate code
⚠ Performance Consideration: Autoboxing introduces extra memory allocation (objects) and can cause performance overhead in large-scale applications.
 */

