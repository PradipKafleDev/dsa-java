package queue;

import java.util.ArrayDeque;
import java.util.Arrays;

public class QueueDay2 {
    public static void main(String[] args) {
//        int[] arr = {2, 5, 1, 3, 2, 1, 4, 5};
//        int[] ans = slidingWindowMaximum(arr, 4);
//        System.out.println(Arrays.toString(ans)); // [5,5,3,4,5]

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int[] ans = firstNegativeNumberInWindow(arr, 3);
        System.out.println(Arrays.toString(ans));
    }

    static int[] slidingWindowMaximum(int[] arr, int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int i = 0;

        while (i < k) {
            if (!dq.isEmpty() && dq.getLast() < arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(arr[i]);
            i++;
        }

        int n = arr.length;
        int ans[] = new int[n - k + 1];
        for (; i < n; i++) {
            ans[i - k] = dq.peekFirst();
            if (arr[i - k] == dq.peekFirst()) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && dq.getLast() < arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(arr[i]);
        }
        ans[n - k] = dq.peekFirst();

        return ans;
    }

    static int[] firstNegativeNumberInWindow(int arr[], int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int i = 0;
        while (i < k) {
            if (arr[i] < 0) {
                dq.offerLast(arr[i]);
            }
            i++;
        }

        int n = arr.length;
        int[] ans = new int[n - k + 1];

        for (; i < n; i++) {
            if (dq.isEmpty()) {
                ans[i - k] = 0;
            } else {
                ans[i - k] = dq.peekFirst();
            }
            if (!dq.isEmpty() && arr[i - k] == dq.peekFirst()) {
                dq.pollFirst();
            }
            if (arr[i] < 0) {
                dq.offerLast(arr[i]);
            }
        }

        if (dq.isEmpty()) {
            ans[n - k] = 0;
        } else {
            ans[n - k] = dq.peekFirst();
        }

        return ans;
    }

}
