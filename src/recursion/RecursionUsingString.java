package recursion;

public class RecursionUsingString {


    static boolean isPalindromeHelper(String str, int l, int r) {
        /*
        - pointer at the beginning and at the end
        - run the fn recursively if str.chatAt(l) is equal to str.chatAt(r)
        - if left >= right then return true because the recursive fn will run if it finds the first el and last el is equl
        - if str.chatAt(l) != str.chatAt(r) then return immediately false;
         */
        if (l >= r) return true;
        if (str.charAt(l) == str.charAt(r)) {
            return isPalindromeHelper(str, l + 1, r - 1);
        }
        return false;
    }

    static boolean isPalindrome(String str) {
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    static int findOccurrenceHelper(String str, String target, int idx) {
        if(idx > str.length() - target.length()) return 0;

        int subProblemAnswer = findOccurrenceHelper(str, target, idx+1);
        boolean isMatchingSubstring = str.substring(idx, idx+ target.length()).equals(target);

        if(isMatchingSubstring) return subProblemAnswer + 1;
        else  return subProblemAnswer;
    }

    static int findOccurrence(String str, String target) {
        return findOccurrenceHelper(str, target, 0);
    }


    public static void main(String[] args) {
        System.out.println(findOccurrence("ababbabac", "aba"));

    }

}
