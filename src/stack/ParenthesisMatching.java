package stack;

import java.util.ArrayDeque;

/**
 * Question: Given a string s containing just the characters '(',')','[',']','{','}',
 * determine if the input string is valid,<br/>
 * <p>
 * Note: An input string is valid if: <br/>
 * 1. Open brackets must be closed by the same type of brackets <br/>
 * 2. Open brackets must be closed in the correct order. <br/>
 * 3. Every close bracket has a corresponding open bracket of same type <br/>
 * <p>
 * Input: s = "()[]{}" <br/>
 * Output: true
 */
public class ParenthesisMatching {

    public static void main(String[] args) {
        String str = "(){}[]";
        String str1 = "({[]()})";
        boolean result = isValidMatchingParenthesis(str);
        System.out.println(result);

    }

    static boolean isValidMatchingParenthesis(String str) {
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();

        if (str.length() % 2 != 0) return false;

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                arrayDeque.push(curr);
            } else {
                if (arrayDeque.isEmpty()) return false;
                char top = arrayDeque.peek();
                if ((top == '(' && curr == ')') || (top == '{' && curr == '}') || (top == '[' && curr == ']')) {
                    arrayDeque.pop();
                }
            }
        }

        return arrayDeque.isEmpty();
    }

}
