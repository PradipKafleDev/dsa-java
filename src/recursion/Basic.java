package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

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

    static void generateSubsets(String s) {
        utilSubsets(s, 0, " ");

    }

    static void utilSubsets(String s, int i, String curr) {

        if (i == s.length()) {
            System.out.println(curr);
            return;
        }

        utilSubsets(s, i + 1, curr);
        utilSubsets(s, i + 1, curr + s.charAt(i));

    }


    public static void main(String[] args) {
//       int ans =  printSumNaturalNumber(5);
//       int ans = powerOfNumber(2,5);
       generateSubsets("abc");


    }

}
