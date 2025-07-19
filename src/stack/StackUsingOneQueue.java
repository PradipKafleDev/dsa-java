package stack;

import java.util.LinkedList;
import java.util.Queue;

/***
 * Implementation of stack using a single queue
 */
public class StackUsingOneQueue {

    private Queue<Integer> queue = new LinkedList<>();

    public void push(int data) {
        queue.offer(data);
    }

    public int pop() {
        if (queue.isEmpty()) {
            return -1;
        }

        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }
        return queue.poll();
    }

}
