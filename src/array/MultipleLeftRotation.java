package array;

import util.Util;

public class MultipleLeftRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3};
        int[][] ans = multipleRotation(a, b);

        for (int[] e : ans) {
            Util.printArray(e);
            System.out.println();
        }
    }

    static int[][] multipleRotation(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int[][] ans = new int[m][n];
        int[] temp = new int[2 * n];

        // populating temp with {1, 2, 3, 4, 5, 1, 2, 3, 4, 5 }
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
            temp[i + n] = a[i];
        }

        for (int i = 0; i < m; i++) {
            /*
            case when b = {1, 9}
            if we have to rotate the array 9 times and the size of array is 5 then, it basically means:
            9 mod b.length = 4, so start from 4th index.
            Tips: rotating array 10 times mean completing the round 2 times as the size of array is 5.
             */
            int offSet = (b[i]) % n;
            for (int j = 0; j < n; j++) {
                ans[i][j] = temp[j + offSet];
            }
        }

        return ans;
    }

    static void rotateByk(int a[], int k, int[][] ans, int times) {
        int n = a.length - 1;
        for (int i = 0; i < k; i++) {
            int temp = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[n] = temp;
            ans[times] = a;
        }
    }

}
