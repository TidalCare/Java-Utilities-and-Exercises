package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();        
        for (int i = 0; i < nums.length; i++) {
            int answerNumber = target - nums[i];
            
            if (seen.containsKey(answerNumber)) {
                return new int[] { seen.get(answerNumber), i };
            }
            
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution"); 
    }
    
    public static void main(String[] args) {
        TwoSum solution = new TwoSum(); 
        
        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test 1 Input: nums=" + Arrays.toString(nums1) + ", target=" + target1);
        System.out.println("Test 1 Output: " + Arrays.toString(result1)); // Expected: [0, 1]

        // Test Case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test 2 Input: nums=" + Arrays.toString(nums2) + ", target=" + target2);
        System.out.println("Test 2 Output: " + Arrays.toString(result2)); // Expected: [1, 2]

        // Test Case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Test 3 Input: nums=" + Arrays.toString(nums3) + ", target=" + target3);
        System.out.println("Test 3 Output: " + Arrays.toString(result3)); // Expected: [0, 1]

        // Test Case 4
        int[] nums4 = {-1, -2, -3, -4, -5};
        int target4 = -8;
        int[] result4 = solution.twoSum(nums4, target4);
        System.out.println("Test 4 Input: nums=" + Arrays.toString(nums4) + ", target=" + target4);
        System.out.println("Test 4 Output: " + Arrays.toString(result4)); // Expected: [2, 4]
        
        // Test Case 5
        int[] nums5 = {10, -5, 2, 7};
        int target5 = 5;
        int[] result5 = solution.twoSum(nums5, target5);
        System.out.println("Test 5 Input: nums=" + Arrays.toString(nums5) + ", target=" + target5);
        System.out.println("Test 5 Output: " + Arrays.toString(result5)); // Expected: [0, 1]

        // Test Case 6
        int[] nums6 = {0, 4, 3, 0};
        int target6 = 0;
        int[] result6 = solution.twoSum(nums6, target6);
        System.out.println("Test 6 Input: nums=" + Arrays.toString(nums6) + ", target=" + target6);
        System.out.println("Test 6 Output: " + Arrays.toString(result6)); // Expected: [0, 3]
        
        // Test Case 7
        int[] nums7 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target7 = 17;
        int[] result7 = solution.twoSum(nums7, target7);
        System.out.println("Test 7 Input: nums=" + Arrays.toString(nums7) + ", target=" + target7);
        System.out.println("Test 7 Output: " + Arrays.toString(result7)); // Expected: [7, 8]
    }
}
