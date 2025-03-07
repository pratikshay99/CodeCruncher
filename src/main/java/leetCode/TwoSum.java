package leetCode;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = ts.twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = ts.twoSum(nums2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = ts.twoSum(nums3, target3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    }
    //Using BruteForce
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for(int i=0; i< len - 1; i++){
            for(int j=i+1; j<len; j++){
                if(nums[i]+nums[j]== target)
                    return new int[]{i,j};
            }
        }
        return new int []{};
    }
   // Solution 2: (Two-pass Hash Table)

}
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
1.Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
2: Input: nums = [3,2,4], target = 6
Output: [1,2]
3:Input: nums = [3,3], target = 6
Output: [0,1]
Only one valid answer exists.

 */

