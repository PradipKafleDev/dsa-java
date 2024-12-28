package array;

/**
 *  Question: You are given an integer array A of length n that represents a permutation of the integers in the range
 *  [0, n - 1], ( if the n is 6 and the arr will be  < 6 i. e { 1, 2, 5, 4}
 *
 *  We split A into some number of Partitions, and individually sort each chunk. After joining them, the result should
 *  equal the sorted array.
 *
 *  Return the largest number of chunks we can make to sort the array.
 */

public class MaxChunkToMakeSorted {
    public static void main(String[] args) {
//      int[] arr = {0, 1, 2, 4, 3};
//      int[] arr = {2, 0, 3, 1, 7, 6, 4, 5};
        int[] arr = {1, 2, 0, 4, 3, 5, 6, 8, 7};
        System.out.println(maxChunkToMakeSorted(arr));
    }

    static int maxChunkToMakeSorted(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int chunkCount = 0;
        int n = arr.length;

        if( n == 0) return 0;

        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]);
            if (i == maxSoFar) {
                chunkCount++;
            }
        }
        return chunkCount;
    }

}
