package Array;

public class SecondLargest {
    static int secondLargestNumber(int[]a ){
        int largest=0;
        int secondlargest =-1;
        for (int i = 1; i <a.length ; i++) {
            if(a.length<2) return -1;

           if(a[i]>a[largest]){
              secondlargest=largest;
              largest=i;
           }
           else if(secondlargest==-1 || a[i]<a[largest]){
               if(a[i]>secondlargest){
                   secondlargest=i;

               }

           }
        }
        return a[secondlargest];
    }

    public static void main(String[] args) {
        int []a={2,3,9,5,4,7,11,16};
        System.out.println(secondLargestNumber(a));

    }
}
