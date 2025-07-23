package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithGetMin {
    Queue<Integer> q = new LinkedList<>();
    Deque<Integer> minQ = new ArrayDeque<>();

    // Initially we add the data to the q
    // if the minQ is not empty and the last element in the minQ is greater than data
    // we remove the element till the data is small then the elements present the minq
    // and at last we add the data to the minQ
    void enqueue(int data) {
        q.offer(data);
        while (!minQ.isEmpty() && minQ.getLast() > data) {
            minQ.pollLast();
        }
        minQ.offerLast(data);
    }

    void dequeue() {
        if (q.isEmpty()) return;
        int removed = q.poll();
        if (removed == minQ.getFirst()) {
            minQ.pollFirst();
        }
    }

    int getMin() {
        return minQ.getFirst();
    }

}
