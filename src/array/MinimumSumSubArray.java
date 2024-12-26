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
                // firstly we will increase the r and move that r to the point when currentSum > == target
            while (currentSum >= target) {
                // At this point we found the currSum > = target ( 1, 2, 5 ) = 8
                // we will update the length if the currLength is mim then minLength
                // with to the previous minLength
                // Now, we will minimize the window size, so we will update curr sum and left window
                // currSum = currSum = a[l] --> 8 - 1 , currSum= 7
                // left = 0 + 1 --> l = 1 and so on....

                int currentLength = r - l + 1;
                minLength = Math.min(minLength, currentLength);
                currentSum -= arr[l];
                l++;
            }
            r++;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
