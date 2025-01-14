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
//
//        stack.printStack(); //2 as we pull out 8,1,4 : LIFO

        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.push(4);
        stackUsingLinkedList.push(1);
        stackUsingLinkedList.push(8);

        while (!stackUsingLinkedList.isEmpty()){
            System.out.print(stackUsingLinkedList.pop() + " ");
        }
        System.out.println();
        stackUsingLinkedList.push(8);

        System.out.println(stackUsingLinkedList.peek());
    }

}
