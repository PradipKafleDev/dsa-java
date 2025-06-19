package linkedlist;

import template.Node;

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

    static boolean isLinkedListPalindrome(Node head) {
        Node middle = LinkedListBasic.findMiddleLinkedlist(head);
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

    static Node mergedTwoSortedLinkedList(Node head1, Node head2) {
        Node head = null, tail = null;

        Node a = head1;
        Node b = head2;

        if (a == null) return b;
        if (b == null) return a;

        if (a.data <= b.data) {
            head = a;
            tail = a;
            a = a.next;
        } else {
            head = b;
            tail = b;
            b = b.next;

        }

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }

        }

        if (a == null) tail.next = b;
        if (b == null) tail.next = a;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(30);
//        head.next.next.next.next = new Node(10);
        System.out.println(isLinkedListPalindrome(head));
//        printLinkedList(head);
//        Node newHead = reverseLinkedList(head);
//        Node newHead = reverseRecursiveLinkedList(head);
//        printLinkedList(newHead);

    }

}
