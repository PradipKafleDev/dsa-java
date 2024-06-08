package timeComplexity;

public class BigONotation {

    public static  void main (String[] args){

    }


    // O(1)
    static int getFirstNumber(int [] arr ){
        return arr[0];
    }


    static boolean checkIfNumberIsPresent( int arr[], int key){
        for(int element: arr){
            if(element == key) return true;
        }
        return false;
    }
}


