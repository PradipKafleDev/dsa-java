package recursion;

/*

Formula:
nCr = (n-1) C (r-1) + (n-1) C (r)
 */

public class NCRProblem {
    static int nCr(int n, int r) {
        if (n == r || r == 0) return 1;
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    static int josephusProblem(int n, int k) {
        if (n == 1) return 0; // if there is only one player then that the only player, so he is the winner
        return (josephusProblem(n - 1, k) + k) % n;
    }

    static boolean isPalindrome(String str, int l, int r ) {
        if( l >= r) return  true;
        if(str.charAt(l) == str.charAt(r)) {
            return isPalindrome(str, l+1, r-1);
        }
        return false;
    }


    public static void main(String[] args) {
        String str = "racr";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }

}
