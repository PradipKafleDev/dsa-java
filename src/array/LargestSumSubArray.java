package array;

public class LargestSumSubArray {

    static int  largestSumSubArray(int[] a){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <a.length ; i++) {
            currSum+=a[i];
            if(currSum <0) currSum =0;
            if(currSum >maxSum) {
                maxSum = currSum;
            }


        }
        return maxSum;
    }

    public static void main (String[] args){
        int []a = {6,-7,4,-2,1,5,-4};
        System.out.println(largestSumSubArray(a)); ;
    }

}
