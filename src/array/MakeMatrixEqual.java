package array;

import java.util.Arrays;

public class MakeMatrixEqual {
    public static void main(String[] args) {
        int[][] arr = {
                { 3, 63, 42},
                { 18, 12, 12},
                { 15, 21, 18},
                { 33, 84, 24},
        };
        int k = 3;
        int result = makeMatrixEqual(arr, k);
        System.out.println(result);
    }

    static int makeMatrixEqual(int[][] a, int k) {
        int n = a.length;
        if (n == 0) return 0;
        int m = a[0].length;
        int total = n * m;
        int[] arr = new int[total];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i * m + j] = a[i][j];
            }
        }

        Arrays.sort(arr);

//        for (int i = 0; i < total ; i++) {
//           System.out.println(i + " " + arr[i] + " " + makeMatrixEqualHelper(b, b[i], k));
//        }

        int median = arr[total / 2];
        return makeMatrixEqualHelper(arr, median, k);
    }


    static int makeMatrixEqualHelper(int[] arr, int toEqual, int numOfOperation) {
        int count = 0;
        for (int j : arr) {
            count += Math.abs((j - toEqual) / numOfOperation);
        }

        return count;
    }

}
