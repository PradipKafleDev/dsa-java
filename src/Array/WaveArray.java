package Array;

import util.Util;

import java.util.Arrays;

/*
Question: Given an array of integers A, sort the array into a wave-like array and return it.
In other word, arrange the elements into a sequence such that
a1 >= a2 <= a3 >= a4 <= a5 ....
Note: If multiple answers are possible, return the lexicographically smallest one

Input: {1,9,5,2,0,7,4,8,3,6}
Output: can be {9,1,5,0,7,2,8,3,6,4} or {1,0,3,2,5,4,7,6,9,8 } --> is lexicographically smallest
 */
public class WaveArray {

    public static void main(String[] args) {
        int[] a = {1, 9, 5, 2, 0, 7, 4, 8, 3, 6};
        // int[] sortedArray = 012345678
        sortIntoWave(a);
        Util.printArray(a);
    }

    static void sortIntoWave(int[] a) {
        Arrays.sort(a);// easy to return lexicographically
        for (int i = 0; i < a.length - 1; i += 2) {
            swap(i, i + 1, a);
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortIntoWaveWithoutLexicographicOrder(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i += 2) {
            if (a[i] > a[i - 1]) {
                swap(i, i - 1, a);
            }
            if (i < n - 1 && a[i] > a[i + 1]) {
                swap(i, i + 1, a);
            }
        }
    }

}
