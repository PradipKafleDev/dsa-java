package queue;

public class Main {
    public static void main (String args[]){

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


        CircularQueue cq = new CircularQueue(4);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.printQueue();
        System.out.println(cq.peek());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
    }

}
