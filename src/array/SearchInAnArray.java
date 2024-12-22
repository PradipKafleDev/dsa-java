package array;

public class SearchInAnArray {
    public static void main (String[] args){

        int a[]={2,1,4,6,5};
        int key=6;
        int res= -1;
        //search for key
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==key){
                res=i; // storing index in result
                break;

            }

        }
        if(res==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key is present at"+ res);
        }

    }

}
