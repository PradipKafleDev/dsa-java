package array;

public class CheckArrayIsSorted {
    static boolean isSorted(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] <= arr[end]) {
                start++;
            } else if (arr[start] > arr[end]) {
                return false;
            } else {
                end--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(isSorted(arr));
    }

}
