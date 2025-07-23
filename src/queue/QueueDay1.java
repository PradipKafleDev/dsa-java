package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDay1 {
    public static void main(String[] args) {
        String str = "abcbacdabcdeef"; //aaaac#dddddd#e#f
        System.out.println(firstNonRepeatingCharacter(str));

    }

    // First non-repeating character in a stream
    static String firstNonRepeatingCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        // From a...z
        int[] frequency = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            q.offer(chr);
            // `a` == 97,
            frequency[chr - 'a']++;

            while (!q.isEmpty() && frequency[q.peek() - 'a'] > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                sb.append('#');
            } else {
                sb.append(q.peek());
            }
        }

        return sb.toString();
    }

}
