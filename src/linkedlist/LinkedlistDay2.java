package linkedlist;

public class LinkedlistDay2 {

    static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) return head;
        Node prev = head;
        Node curr = head.next;
        head.next = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    static Node reverseRecursiveLinkedList(Node head) {
        if (head == null || head.next == null) return head;
        Node temp = head.next;
        Node newHead = reverseRecursiveLinkedList(head.next);
        temp.next = head;
        head.next = null;
        return newHead;

    }

    static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static boolean isLLPalindrome(Node head) {
        Node middle = LinkedListBasic.findMiddleLinkedlIst(head);
        Node t2 = reverseLinkedList(middle);
        Node t1 = head;

        while (t2 != null) {
            if (t1.data != t2.data) {
                return false;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(30);
//        head.next.next.next.next = new Node(10);

        System.out.println(isLLPalindrome(head));
//        printLinkedList(head);
//        Node newHead = reverseLinkedList(head);
//        Node newHead = reverseRecursiveLinkedList(head);
//        printLinkedList(newHead);

    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
