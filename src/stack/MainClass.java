package stack;

public class MainClass {
    public static void main(String[] args) throws Exception {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(8);

        stack.pop();
        stack.pop();
        stack.pop();

        stack.printStack(); //2 as we pull out 8,1,4 : LIFO
    }

}
