package stack;

public interface CustomStackInterface {
    int push(int element);
    int pop() throws Exception;
    int peak() throws Exception;
    boolean isEmpty();
    boolean isFull();
    int size();
    void printStack();
}
