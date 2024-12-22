package array;

public class DeleteAnArray {
    public static int[] delete(int []a , int key){
       int[] deletedArray= new int[a.length];
       int j=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=key){
                deletedArray[j]=a[i];
                j++;
            }

        }
        return deletedArray;

    }


    public static void main(String[] args) {
        int [] a= { 2,4,6,5,3,9};
        int key=3;
        System.out.println("==========");
        int[] ans = delete(a,key);
        for(int e: ans){
            System.out.print(e+" ");
        }
    }
}
