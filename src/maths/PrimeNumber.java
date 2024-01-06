package maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    static boolean isPrime(int num){
     if(num <= 1){
         return  false;
     }
    for (int i =2; i * i <= num; i++){
        if(num % i == 0){
            return  false;
        }
    }
      return true;

    }

    /*
    Here we will check until i * i <= num or i <= Math.sqrt(num)
    first, we are iterating with 2 and  making all the multiplication of 2 to false:
    second, we move to 3 and making all the multiplication of 3 to false:
    and so on.
     */
    static List<Integer> sieveOfEratosthenes(int n ){
        boolean [] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime,true);

        for(int i =2; i * i <= n; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        List <Integer> result = new ArrayList<>();
        for(int i =2; i <= n; i++){
            if(isPrime[i]){
                result.add(i);
            }
        }
        return  result;
    }

    static ArrayList<Integer> rangePrime(int num){
       var  result = new ArrayList<Integer>();

        for (int i = 2; i < num ; i++) {
            if(isPrime(i)){
                result.add(i);

            }
        }
        return result;
    }
    public static void main(String[] args) {
//        boolean result = isPrime(99);
//        ArrayList<Integer> ans = rangePrime(40);
//        System.out.println(ans);
//        System.out.println(result);
         System.out.println(sieveOfEratosthenes(39));


    }
}
