package priorityQueueAndDisjointSet;

public class Main {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(5);
        maxHeap.insert(1);
        maxHeap.insert(10);
        maxHeap.insert(15);
        maxHeap.insert(20);

        maxHeap.print();
    }
}
