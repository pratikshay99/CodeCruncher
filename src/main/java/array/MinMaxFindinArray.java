package array;

import java.sql.SQLOutput;

public class MinMaxFindinArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        int min = arr[0], max = arr[0];
        //
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            else if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(min);
        System.out.println(max);
        //Using PairWise Solution
        System.out.println("Using pairwise");
        if (arr[0] < arr[1]) {
            min = arr[0];
            max = arr[1];
        } else {
            min = arr[1];
            max = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}

/**
 * 1.
 * Initially, set min = arr[0] and max = arr[0]. No comparison is required here, it's just assignment.
 * For Each Element (starting from i = 1):
 * First comparison: if (arr[i] < min) to check if arr[i] is smaller than the current min.
 * Second comparison (only if the first is false): else if (arr[i] > max) to check if arr[i] is greater than the current max.
 * for every element (except the first one), there are 2 comparisons: one to check the min condition and one to check the max condition.
 * Total comparisons for an array of size n will be 2 * (n - 1) comparisons because you're making 2 comparisons per element starting from index 1.
 * ===================================================================================================================================================
 * 2. pairWise:
 * 1 comparison is performed to initialize min and max with the first two elements.
 * Next, you start iterating through the rest of the array, comparing two elements at a time:
 * For each element arr[i], you perform 2 comparisons:
 * One to check if arr[i] is smaller than the current min.
 * One to check if arr[i] is larger than the current max.
 * If the array has n elements, and you’ve already handled the first two elements, you have n - 2 elements remaining. So, for these n - 2 elements, you will make 2 comparisons per element.
 * Total Comparisons:
 * For the first two elements: 1 comparison.
 * For the remaining n - 2 elements: 2 * (n - 2) comparisons.
 * So, the total number of comparisons is: 1+2×(n−2)=2n−3
 */
