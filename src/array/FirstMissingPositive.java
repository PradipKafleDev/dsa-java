package array;

import util.Util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 * Leetcode : https://leetcode.com/problems/first-missing-positive/description/
 */

public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] nums = {-1, 16, 18, 1, 2, 7, 8, 9, 11, 12};
        int result = firstMissingPositive(nums);
        System.out.println("This is result: " + result);

    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // While nums[i] is in the valid range and not in the correct position
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // swap nums[i] and nums[nums[i] - 1] and put in the correct position
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
        }

        Util.printArray(nums);

        // find the first missing positive number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // if all numbers from 1 to n are in the correct position, return n + 1;
        return n + 1;
    }
}
