package array;

import util.Util;

import java.util.Arrays;
import java.util.HashMap;

/**
 *  Question:
 *  Return the indices of the two numbers so that they add up to target given an array of integers nums and an integer target.
 *  You can make an assumption that every input has exactly one solution, and you may avoid using the same element more than once.
 *  Note: Return the answer in sorted order.
 *
 *  nums:[ 1, 2, 3, 4, 5]
 *  target: 8;
 *  output:[2, 4]
 *
 */

public class ReturnIndicesOfTwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 8;
//        int[] result = twoSumIndices(nums, target);
        int[] result = twoSumIndicesUsingTwoPointer(nums, target);
        Util.printArray(result);
    }

    static int[] twoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }

            map.put(nums[i], i);

        }

        return new int[0];
    }

    static int[] twoSumIndicesUsingTwoPointer(int[] nums, int target){
        // create a new array of pairs (value, index)
        int[][] numWithIndex = new int[nums.length][2];

        // Fill the array with values and their corresponding indices
        for (int i = 0; i < nums.length ; i++) {
            numWithIndex[i][0] = nums[i];
            numWithIndex[i][1] = i;
        }

        // Sort the array based on values (nums)
        Arrays.sort(numWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

        return new int[0];
    }
}
