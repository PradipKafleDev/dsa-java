package SortingDay1;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int a[], int low, int high){
        if(low>=high){
            return;
        }
        int i = low;
        int j = high;
        int mid = i+(j-i)/2;
        int piviot = a[mid];
        while(i<=j){
            while(a[i]<piviot){
                i++;
            }
            while(a[j]>piviot){
                j--;
            }
            if(i<=j){
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;

            }

        }
        //now the piviot is in correct position please two half
        quickSort(a,low, j);
        quickSort(a,i,high);
    }

    public static void main(String[] args) {
        int a[]={4,6,2,4,5,7,9,9,1,3};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
}
