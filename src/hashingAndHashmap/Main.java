package hashingAndHashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static int largestSubarrayWithZeroSum(int a[]){
        Map<Integer,Integer> map = new HashMap<>();;
        //here we are putting 0 at index -1
        map.put(0,-1);
        int ans = 0;
        int cumSum=0;
        for(int i=0; i<a.length;i++){
            cumSum+=a[i];
            if(map.containsKey(cumSum)){
                int previousPosition = map.get(cumSum);
                ans = Math.max(ans, i-previousPosition);

            }else{
                map.put(cumSum,i);

            }



        }
        return ans;

    }

    static int longestConsecutiveSubSequence(int a[]){
        Set<Integer> set= new HashSet<>();
        int ans =0;
        for(int e:a){
            set.add(e);
        }
        for(int e:set){
            if(!set.contains(e-1)){
                int length=0;
                while(set.contains(e+length)){
                    length++;

                }
                ans = Math.max(ans,length);
            }
        }

        return ans;
    }
    public static void main(String[]args){

//        int a[] = {1,1,5,-3,-4,3,4,1};
//        int a[]={2,1,9,3,5,4,8,7,2,6,3};
           int a[]={};
//        int a[]={2,1,9,3,5,4,4,7,2,6,3};

//        System.out.println(largestSubarrayWithZeroSum(a));
        System.out.println(longestConsecutiveSubSequence(a));

    }
}
