package array;

public class SecondLargest {
    private static int secondLargestElement(int[] arr) {
        if(arr.length < 2){
            return -1 ;
        }

        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if( arr[i] > largestElement){
                secondLargestElement = largestElement;
                largestElement = arr[i];

            } else if(arr[i] > secondLargestElement && arr[i] != largestElement){
                secondLargestElement = arr[i];
            }

        }

        return secondLargestElement;

    }
    public static void main(String[] args){

        int[] arr = {21,21,2, 5, 1, 3, 0, 11, -12, 19,19, 11,20, 20,21};
        System.out.println(secondLargestElement(arr));

    }
}
