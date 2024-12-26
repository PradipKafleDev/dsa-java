package array;

/**
 * Question: Given an  array of positive integers. A and a positive integer K, return the minimal length of a  subarray
 * whose sum is greater than or equal to the target. If there is no such subarray, return 0 instead.
 * <p>
 * Note: Use Kadane's Algorithm
 */

public class MinimumSumSubArray {
    public static void main(String[] args) {
//        int[] i = {0, 1, 2, 3, 5, 7, 10, 11};
        int[] i = {1, 2, 5, 6, 7, 2};
        int target = 7;

        System.out.println(minSubarraySumGreaterThanEqualTarget(i, target));

    }

    public static int minSubarraySumGreaterThanEqualTarget(int[] arr, int target) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int l = 0;
        int r = 0;

        while (r < n) {
            currentSum += arr[r];
            while (currentSum >= target) {
                int length = r - l + 1;
                minLength = Math.min(minLength, length);
                currentSum -= arr[l];
                l++;
            }
            r++;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
