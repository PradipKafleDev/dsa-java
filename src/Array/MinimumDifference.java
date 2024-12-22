package Array;

import java.util.*;

/**
 *
 * Question: Given an array of distinct integers, find all pairs of elements where the difference between the two elements
 * is the smallest among all pairs in the array
 *  Return these pairs in ascending order, where each pair is represented by [a, b] such that a, b are elements from the
 *  array and a < b. The difference between a and b should be the smallest
 */
public class MinimumDifference {

    public static void main (String[] args){
        int[] a = {12,9,8,2,11,4,5,3};
        List<List<Integer>> res = minDiffPairs(a);
        System.out.println(res);


    }

    static List<List<Integer>> minDiffPairs(int[] a){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
        int n = a.length;

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < n ; i++) {
//            if(a[i] - a[i-1] < minDiff){
//                minDiff = a[i] - a[i-1];
//            }
            minDiff = Math.min(minDiff, a[i]- a[i-1]);
        }

        for (int i = 1; i < n ; i++) {
            if(a[i]- a[i-1] == minDiff){
                List<Integer> temp = new ArrayList<>();
                temp.add(a[i-1]);
                temp.add(a[i]);
                ans.add(temp);
            }
            
        }

        return ans;
    }

}
