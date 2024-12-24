package array;


/**
 * Question: You are given an array of N integers, A1, A2, ... AN. Return maximum value of f(i, j) for all 1 >= j, J<= N.
 * f(i, j) = | A[i] - A[j] | + [i-j], where |x| denotes absolute value of x.
 *
 * Note:
 * aipi -> a[i] plus i;
 * aimi -> a[i] minus i;
 */

public class MaximumAbsoluteDifference {

    public static void main(String[] args) {
        int[] a = {12, 9, 8, 2, 11, 5, 4, 5};
        System.out.println(maxAbsoluteDifference(a));
    }

    static int maxAbsoluteDifference(int[] a) {
        int n = a.length;

        int minaipi = Integer.MAX_VALUE;
        int maxaipi = Integer.MIN_VALUE;

        int minaimi = Integer.MAX_VALUE;
        int maxaimi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            minaipi = Math.min(minaipi, a[i] + i);
            maxaipi = Math.max(maxaipi, a[i] + i);

            minaimi = Math.min(minaimi, a[i] - i);
            maxaimi = Math.max(maxaimi, a[i] - i);
        }

        int diffaipi = maxaipi - minaipi;
        int diffaimi = maxaimi - minaimi;

        return Math.max(diffaipi, diffaimi);
    }

}
