package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problems {

    static int countDistinctElements(int a []){
        Set<Integer> set = new HashSet<>();
        for(int e :a){
            set.add(e);
        }
        System.out.println(set);
        return set.size();
    }

    static void frequencyOfElement(int a[]){
        Map <Integer,Integer> map = new HashMap<>();
        for(int e:a){
            if(map.containsKey(e)){
                int temp = map.get(e);
                map.put(e,temp+1);
            }else{
                map.put(e,1);
            }
        }
        System.out.println(map);
    }

    static boolean zeroSumSubarray(int a[]){
        //cumSum means cumulutative sum
        Set<Integer>set = new HashSet<>();
        int cumSum = 0;
        set.add(0);
        for(int e:a){
            if(set.contains(cumSum)) return true;
            set.add(cumSum);

        }
        return false;

    }

    static boolean pairWithGivenSum(int a[],int sum){
        Set<Integer> set = new HashSet<>();
        for(int e:a){
            int comp = sum-e;
            if(set.contains(comp)) return true;
            set.add(e);
        }
        return false;

    }



    public static void main(String[] args){
//        int a[]={1,2,5,6,8,2,2,4,4,5};
//        int a[]={10,-10};
        int a[]={0,0};

//      System.out.println(countDistinctElements(a));
//        frequencyOfElement(a);
//        System.out.println(pairWithGivenSum(a,8));
        System.out.println(zeroSumSubarray(a));

    }
}
