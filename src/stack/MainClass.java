package stack;

public class MainClass {
    public static void main(String[] args) throws Exception {
        StackUsingArray stack = new StackUsingArray(3);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(8);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
