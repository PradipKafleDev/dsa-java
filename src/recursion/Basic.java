package recursion;

public class Basic {
    static int i=0;

    static int  printSumNaturalNumber(int n){

        if(n == 0) return 0;
        return printSumNaturalNumber(n-1)+n;

    }

    static int powerOfNumber(int base, int exponent){
        if(exponent==0) return 1;

        return base* powerOfNumber(base,exponent-1);



    }


    public static void main(String[] args) {
//       int ans =  printSumNaturalNumber(5);
       int ans = powerOfNumber(2,5);
        System.out.println(ans);

    }

}
