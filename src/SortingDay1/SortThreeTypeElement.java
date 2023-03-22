package SortingDay1;

public class SortThreeTypeElement {
    static void sortThreeTypeElement(int[]a){
        for (int i = 0; i <a.length-1 ; i++) {
            boolean isSwapped =false;
            for (int j = 0; j <a.length-1-i ; j++) {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isSwapped=true;
                }

            }
            if(!isSwapped) break;

        }
    }
    static void printArray(int[]a){
        for(int e:a){
            System.out.print(e+" ");
        }
    }
    public static void main(String[] args) {
        int[]a={2,2,1,0,0,1,2,0,1};
        sortThreeTypeElement(a);
        printArray(a);

    }
}
