package stack;

public class StackUsingArray implements CustomStackInterface {

    private final int[] arr;
    private final int capacity;
    private int idx;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        idx = -1;
    }

    @Override
    public int push(int element) throws StackOverflowError {
        if (idx == capacity - 1) throw new StackOverflowError("Stack size exceeds");
        idx++;
        arr[idx] = element;
        return arr.length;
    }

    @Override
    public int pop() throws Exception {
        if (idx == -1) throw new Exception("Stack is Empty");
        int ans = arr[idx];
        idx--;
        return ans;
    }

    @Override
    public int peak() throws Exception {
        if (idx == 1) throw new Exception("Stack is Empty");
        return arr[idx];
    }

    @Override
    public boolean isEmpty() {
        return idx == -1;
    }

    @Override
    public int size() {
        return idx + 1;
    }

    @Override
    public boolean isFull() {
        return !isEmpty();
    }

    @Override
    public void printStack() {
        for (int i = 0; i <= idx; i++) {
            System.out.println(arr[idx]);
        }
    }

}
