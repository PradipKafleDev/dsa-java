package queue;

public class QueueBasic {
    int size;
    private final int[] items;
    private int rear, front;

    public QueueBasic(int size) {
        this.size = size;
        items = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full, cannot add new Element");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear++;
        items[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty cannot deque");
            return -1;
        }

        int temp = items[front];

        if (front == rear) {
            front = rear = -1;
            return temp;
        }
        front++;
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot peak");
            return -1;
        }
        return items[front];
    }

    public void printQueue(){
        if(isEmpty()) return;
        for(int i = front; i <= rear; i++){
            System.out.println(items[i]);
        }
        System.out.println();
    }

}
