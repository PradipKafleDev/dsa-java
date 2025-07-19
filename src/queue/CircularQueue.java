package queue;

public class CircularQueue {
    int size;
    int a[];
    int front, rear;

    public CircularQueue(int size) {
        this.size = size;
        a = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        if (rear == size - 1 && front == 0) return true;
        if (rear + 1 == front) return true;
        return false;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full, cannot add new element");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        a[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty, cannot dequeu");
        }
        int temp = a[front];
        if (front == rear) {
            front = rear = -1;
            return temp;
        }
        front = (front + 1) % size;
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot peek");
            return -1;
        }

        return a[front];
    }

    public void printQueue() {
        if (isEmpty()) return;
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.println(a[i] + " ");
            }
        } else {
            for (int i = front; i < size; i++) {
                System.out.println(a[i] + " ");
            }

            for (int i = 0; i <= rear; i++) {
                System.out.println(a[i] + " ");
            }
        }
        System.out.println();
    }

}
