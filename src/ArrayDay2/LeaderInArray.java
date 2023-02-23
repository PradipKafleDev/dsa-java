package ArrayDay2;

import java.util.Arrays;

public class LeaderInArray {

    static void largestElementInArray(int []a){
        int largest = Integer.MIN_VALUE; //give the minimum value
        int b[] = new int[a.length];
        int j=0;
        for (int i = a.length-1; i >=0 ; i--) {
            if(a[i]>largest){
                largest=a[i];
//                System.out.print(a[i]+" "); for printing 3,4,6,7
//                b[j++]=a[i];
                b[j]=a[i];
                j++;
            }

        }

        for(j=j-1;j>=0;j--){
            System.out.println("index j: "+ j +  " =>>> value: "+b[j] );
        }


    }
    public static void main (String[] args){
        int [] a = {2,7,6,4,1,3};
        largestElementInArray(a);
    }
}
