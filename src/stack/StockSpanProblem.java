package stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Question: The stock span problem is a financial problem where we have a series of daily price quotes for a stock
 * and we need to calculate the span of stock price for all days.
 *
 * @Link <a href="https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1">Stack Span Problem</a>
 * <br/>
 * Input: arr[] = [100, 80, 60, 70, 60, 75, 85]
 * <br/>
 * Output: [1, 1, 1, 2, 1, 4, 6]
 * <p>
 * Note: The span arr[i] of the stocks price on a given day i is defined as the maximum number of consecutive days
 * just before the given day, for which the price of the stock on the given day is less than or equal to its price
 * on the current day.
 */

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1}; // [1, 2, 3, 4, 5]
        int[] arr1 = {100, 80, 60, 70, 60, 75, 85}; // [1, 1, 1, 2, 1, 4, 6]
        int[] arr2 = {100, 180, 60, 70, 60, 75, 185}; // [1, 1, 1, 2, 1, 4, 6]
        int[] result = calculateSpan(arr2); // [1, 2, 1, 2, 1, 4, 7]
        System.out.println(Arrays.toString(result));

    }

    static int[] calculateSpan(int[] arr) {
        int[] ans = new int[arr.length];
        ans[0] = 1;
        // In stack, we will maintain the descending order , and add the index accordingly,
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty()) {
                int top = stack.peek();
                if (arr[top] > arr[i]) {
                    break;
                } else {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                // handle case for [ 1, 2, 3] for 3, we have to clear the stack is there is no greater element than 3
                // so the ans will be indexOf(3) + 1;
                ans[i] = i + 1;
            } else {
                ans[i] = i - stack.peek();
            }
            stack.push(i);
        }

        return ans;
    }


}
