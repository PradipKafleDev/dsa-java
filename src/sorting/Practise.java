package sorting;

public class Practise {


    static void bubble(int a []){
        for(int i =0; i<a.length; i ++){
            for(int j =0; j< a.length-1; j++){
                int temp;
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp;
                }
            }

        }
    }

    public static void main (String[] args){
        int [] a = { 1,2,9,12,4,16,17,21,2,8};
        bubble(a);
        for(int e: a){
            System.out.print(e + " ");
        }

    }

}
