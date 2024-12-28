package array;

import util.Util;

/**
 * Question: You are given an integer array arr.
 * We split arr into some number of chunks ( i. e partitions), and individually sort each chunk. After
 * concatenating them, the result should equal sorted array.
 * <p>
 * Return the largest number of chunks we can make to sort the array.
 * <p>
 * Input: [8,2,5,2]
 * output : 1
 */

public class MaxChunkToMakeSortedAdvanced {
    public static void main(String[] args) {
//        int[] arr = {1, 4, 7, 3, 8, 9, 6};
//        int[] arr = {2, 4, 1, 7, 5, 6, 9, 8};
        int[] arr = {1, 1, 1, 2, 2, 6, 6, 5, 5};
        int ans = maxChunkToMakeSortedAdvance(arr);
        System.out.println(ans);

    }

    static int maxChunkToMakeSortedAdvance(int[] arr) {
//        int[] leftMax = processFromLeftWithMaxVal(arr); // { 2, 4, 4, 7, 7, 7, 9, 9}
//        int[] rightMin = processFromRightWithMinVal(arr); // { 1, 1, 1, 5, 5, 6, 8, 8, 2}

        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];
        leftMax[0] = arr[0];
        rightMin[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(arr[i], rightMin[i + 1]);
        }

        int chunk = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (leftMax[i] <= rightMin[i + 1]) {
                chunk++;
            }
        }

        return chunk;
    }


    static int[] processFromLeftWithMaxVal(int[] arr) {
        int[] result = new int[arr.length];
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                result[i] = arr[i];
                maxValue = arr[i];
            } else {
                result[i] = maxValue;
            }

        }

        return result;
    }

    static int[] processFromRightWithMinVal(int[] arr) {
        int[] result = new int[arr.length];
        int minValue = Integer.MAX_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < minValue) {
                result[i] = arr[i];
                minValue = arr[i];
            } else {
                result[i] = minValue;
            }
        }

        return result;
    }

}
