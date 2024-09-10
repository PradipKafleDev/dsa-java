package priorityQueue;

/*
 *
 * capacity: Elements it can have
 * size: Size of the heap
 *
 * */

import java.util.Arrays;

public class MaxHeap {
    int a[];
    int capacity;
    int size;

    public MaxHeap(int capacity) {
        this.a = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    //TC: 0(logn)
    public void insert(int e) {
        if (size == capacity) return;
        a[size] = e;
        int i = size;

        while (i > 0) {
            int parent = (i - 1) / 2;
            if (a[parent] < a[i]) {
                swap(i, parent);
                i = parent;
            } else break;
        }

        size++;
    }

    public  void print(){
        System.out.println(Arrays.toString(a));
    }

}
