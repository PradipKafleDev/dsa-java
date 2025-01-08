package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets {
    public static void main(String[] args) {
        String str = "abc";
        /*
        * Note: Total subsets can be calculated : 2 power n ( 2 ^ n) i.e 2* 2* 2 = 8
        *
        "", a, b, c, ab, ac, bc, abc
        *  Tips: include first letter and do not include letter
        *               ""
        *            /       \
        *      a--> a         ""
        *          /  \       /  \
        * b-->   ab     a     b     ""
        *       /  \   / \   /  \   /  \
        * c ->abc  ab ac  a  bc  b  c   " "
         */
        String s = "abac";
        int[] nums = {1, 2, 3};
        List<List<Integer>> subSets = generateSubsets(nums);
        System.out.println(subSets);
//        printAllSubsets(str);
    }

    static void printAllSubsets(String s) {
        printAllSubsetsHelper(s, "", 0);
    }

    static void printAllSubsetsHelper(String str, String curr, int idx) {

        if (idx == str.length()) {
            System.out.println(curr);
            return;
        }

        printAllSubsetsHelper(str, curr + str.charAt(idx), idx + 1);
        printAllSubsetsHelper(str, curr, idx + 1);
    }

    public static List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsetsHelper(nums, 0, new ArrayList<>(), result);
        return result;
    }

    static void generateSubsetsHelper(int[] nums, int start, List<Integer> curr, List<List<Integer>> result) {
        result.add(new ArrayList<>(curr));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; // skip duplicates
            curr.add(nums[i]);
            generateSubsetsHelper(nums, i + 1, curr, result);
            curr.remove(curr.size() - 1);
        }
    }

}
