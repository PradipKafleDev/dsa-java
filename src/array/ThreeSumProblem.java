package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Given an integer array nums, return all the triplets such that nums[i] + nums[j] + nums[k] = 0 for
 * distinct i, j, k
 * Notice that the solution set must not contain duplicate triplets
 *
 * Note:
 *  To Find: a[i] + a[j] + a[k] = 0;
 *  Thus,  a[i] + a[j] = - a[k], find two sum which is equals to - a[k]
 *
 * */

public class ThreeSumProblem {
    public static void main(String[] args) {
        int[] arr = {4, 2, -1, -3, 0, 1, 2, 3};
        int[] arr1 = {4, 2, 2, 2, 1, 1, 1, -1, -3, 0, 1, 2, 3, 3, 3, 3};

        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            /* *
             * finding the sum which is negative of ith element i.e ( -a[k] = a[i] + a[j] )
             *  { -3, -1, 0, 1, 2, 2, 3, 4}
             *  for -3,  return the two number which sum is 3 and compute from { -1, 0, 1, 2, 2, 3, 4 }
             */
            List<List<Integer>> temp = twoSum(arr, -arr[i], i + 1);
            for (List<Integer> list : temp) {
                list.addFirst(arr[i]);
                triplets.add(list);
            }

        }

        System.out.println(triplets);

    }

    static List<List<Integer>> twoSum(int[] arr, int target, int startFrom) {
        int left = startFrom;
        int right = arr.length - 1;

        List<List<Integer>> result = new ArrayList<>();

        while (left < right) {

            //skipping when the next element is same as previous element to reduce computation
            if (left > startFrom && arr[left] == arr[left - 1]) {
                left++;
                continue;
            }

            //skipping when the next element is same as previous element to reduce computation
            if (right < arr.length - 1 && arr[right] == arr[right + 1]) {
                right--;
                continue;
            }

            int sum = arr[left] + arr[right];

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[left]);
                temp.add(arr[right]);
                result.add(temp);
                left++;
                right--;
            }

        }

        return result;
    }

}
