package array;

public class RemoveDuplicate {
    static int[] removeDuplicate(int[] a) {
        int j = 0;
        int n = a.length;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[j]) {
                a[j + 1] = a[i];
                j++;

            }


        }
        return a;


    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5, 6};
        int[] ans = removeDuplicate(a);
        for (int e : ans) {
            System.out.println(e + " ");
        }


    }
}
