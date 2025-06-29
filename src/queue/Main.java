package queue;

public class Main {
    public static void main (String args[]){
        QueueBasic q = new QueueBasic(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.printQueue();

        System.out.println(q.peek()); // 10
        System.out.println(q.dequeue()); //10
        System.out.println(q.dequeue()); //20

        q.printQueue(); // 30 40
    }

}
