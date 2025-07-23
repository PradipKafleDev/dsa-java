package queue;

public class Main {
    public static void main(String args[]) {

        // Normal Queue
//        QueueBasic q = new QueueBasic(4);
//        q.enqueue(10);
//        q.enqueue(20);
//        q.enqueue(30);
//        q.enqueue(40);
//        q.enqueue(50);
//
//        q.printQueue();
//
//        System.out.println(q.peek()); // 10
//        System.out.println(q.dequeue()); //10
//        System.out.println(q.dequeue()); //20
//
//        q.printQueue(); // 30 40

        //Circular Queue
//        CircularQueue cq = new CircularQueue(4);
//        cq.enqueue(10);
//        cq.enqueue(20);
//        cq.enqueue(30);
//        cq.enqueue(40);
//        cq.enqueue(50);
//
//        cq.printQueue();
//        System.out.println(cq.peek());
//        System.out.println(cq.dequeue());
//        System.out.println(cq.dequeue());

        // Queue using two stack
//        QueueUsingTwoStacks qTwoStacks = new QueueUsingTwoStacks();
//        qTwoStacks.enqueue(10);
//        qTwoStacks.enqueue(20);
//        qTwoStacks.enqueue(30);
//
//        System.out.println(qTwoStacks.dequeue()); //10
//        System.out.println(qTwoStacks.dequeue()); //20
//        System.out.println(qTwoStacks.dequeue());//30
//
//        qTwoStacks.enqueue(40);
//        qTwoStacks.enqueue(50);
//        qTwoStacks.enqueue(60);
//
//        System.out.println(qTwoStacks.dequeue()); //40
//        System.out.println(qTwoStacks.dequeue()); //50
//        System.out.println(qTwoStacks.dequeue()); //60

        //Queue using one stack
//        QueueUsingOneStack qUsingOnStack = new QueueUsingOneStack();
//        qUsingOnStack.enqueue(10);
//        qUsingOnStack.enqueue(20);
//        qUsingOnStack.enqueue(30);
//
//        System.out.println(qUsingOnStack.dequeue()); //10
//        System.out.println(qUsingOnStack.dequeue()); //20
//        System.out.println(qUsingOnStack.dequeue()); //30
//
//        qUsingOnStack.enqueue(40);
//
//        System.out.println(qUsingOnStack.dequeue()); //40

        // Queue getMin impl
        QueueWithGetMin q = new QueueWithGetMin();
        q.enqueue(5);
        q.enqueue(3);

        System.out.println(q.getMin()); //3
        q.dequeue();
        q.enqueue(4);
        q.enqueue(2);
        System.out.println(q.getMin()); //2
    }

}
