package queue;

import java.util.ArrayDeque;

/***
 * Queue using single stack
 */
public class QueueUsingOneStack {

    ArrayDeque<Integer> stack = new ArrayDeque<>();

    public void enqueue(int data) {
        stack.push(data);
    }

    public int dequeue() {
        if (stack.isEmpty()) {
            return -1;
        }
        if (stack.size() == 1) {
            return stack.pop();
        }
        int top = stack.pop();
        int ans = dequeue();
        stack.push(top);
        return ans;
    }

}
