package recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "abba";
        String s1 = "racecar";
        boolean result = isPalindrome(s);
        String s2 = "abba";
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    private static boolean isPalindromeHelper(String s, int i, int j) {
        if (i >= j) return true;
        // check first and last index if equal and go on check until i >= j
        if (s.charAt(i) == s.charAt(j)) {
            return isPalindromeHelper(s, i + 1, j - 1);
        }

        return false;
    }
}
