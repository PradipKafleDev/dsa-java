package recursion;

import java.util.HashSet;
import java.util.Set;

public class Basic {


    static int sumOfDigits(int n) {

        if (n == 0) return 0;
        int lastDigit = n % 10;
        return lastDigit + sumOfDigits(n / 10);

    }

    static int printSumNaturalNumber(int n) {

        if (n == 0) return 0;
        return printSumNaturalNumber(n - 1) + n;

    }

    static int powerOfNumber(int base, int exponent) {
        if (exponent == 0) return 1;

        return base * powerOfNumber(base, exponent - 1);

    }

    static Set<String> generateSubsets(String s) {
        Set<String> set = new HashSet<>();
        return utilSubsets(s, 0, " ", set);

    }

    static Set<String> utilSubsets(String s, int i, String curr, Set<String> set) {

        if (i == s.length()) {
            set.add(curr);
        } else {
            utilSubsets(s, i + 1, curr, set);
            utilSubsets(s, i + 1, curr + s.charAt(i), set);

        }

        return set;

    }


    //Time complexity--> 2^n -1
    static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 0) return;

        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Move " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, aux, to, from);

    }


    public static void main(String[] args) {
//       int ans =  printSumNaturalNumber(5);
//       int ans = powerOfNumber(2,5);
//        Set<String> ans = generateSubsets("abc");

        towerOfHanoi(3, 'A', 'C', 'B');


    }

}
