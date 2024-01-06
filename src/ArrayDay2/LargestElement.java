package ArrayDay2;

public class LargestElement {

    static int findLargestElement(int[] nums){
        int start = 0;
        int end = nums.length -1 ;
        int largestElement = Integer.MIN_VALUE;
        int count=0;

        while (start < end){
            if(nums[start] > nums [end] && nums[start] > largestElement){
                largestElement = nums[start];
                count++;
                start++;
                end--;
            }
            if( nums[end] > nums[start] && nums[end] > largestElement){
                largestElement = nums[end];
                count++;
                start++;
                end--;
            }
            count++;
            start++;
            end--;
        }
        System.out.println(count);
        return  largestElement;

    }
    public static void main(String[] args) {
        int[] arr = {2, 5,1,28, 3, 0,11, -12,19,56};
        System.out.println(findLargestElement(arr));
    }
}
