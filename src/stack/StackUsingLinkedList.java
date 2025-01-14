package stack;

import util.Util;

public class StackUsingLinkedList {

    private Util.StackNode head;

    boolean isEmpty() {
        return head == null;
    }

    void push(int data) {
        Util.StackNode newNode = new Util.StackNode(data);
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int temp = head.data;
            head = head.next;
            return temp;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return head.data;
        }
    }

}
