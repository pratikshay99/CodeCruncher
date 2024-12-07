package array;

import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//in-place reversal
public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0, end = arr.length - 1, temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

        //If you're working with an ArrayList instead of a plain array, you can use Collections.reverse().
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Collections.reverse(list);
        System.out.println(list);

        // Reverse the array using streams
        Integer[] arrStream = {1, 2, 3, 4, 5};
        Arrays.sort(arrStream, Collections.reverseOrder());

        System.out.println("Reversed Array:");
        System.out.println(Arrays.toString(arrStream));
    }
//Initialization at ArrayList time of definition
    // ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    //ArrayList<Integer> list = new ArrayList<>(Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList()));
    // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

}
//array last index: 4(start from 0)---> array length: 4+1=5(starts from 1)
// solution2. Using a New Array (Space Complexity: O(n)) If modifying the original array is not allowed, you can create a new array to store the reversed values.