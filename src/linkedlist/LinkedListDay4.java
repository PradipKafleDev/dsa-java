package linkedlist;

import template.Node;

public class LinkedListDay4 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(5);

//      Node reversedLLLKTimes = reverseLinkedListKTimesRange(head, 4);
        Node partitionLL = partitionLinkedList(head, 4);
        LinkedListBasic.printLinkedList(partitionLL);
    }

    static Node reverseLinkedListKTimesRange(Node head, int k) {
        Node dummy = new Node(-1);
        dummy.next = head;

        Node prevTail = dummy;
        Node currHead = head;

        while (currHead != null) {
            Node currTail = currHead;
            for (int i = 0; i < k - 1; i++) {
                if (currTail == null) break;
                currTail = currTail.next;
            }
            if (currTail == null) break;
            Node nextHead = currTail.next;

            reverseKTimes(currHead, k);
            prevTail.next = currTail;
            currHead.next = nextHead;
            prevTail = currHead;
            currHead = nextHead;
        }
        prevTail.next = currHead;

        return dummy.next;
    }

    static void reverseKTimes(Node node, int k) {
        if (node == null || node.next == null) return;
        Node prev = null, curr = node;
        int count = 0;

        while (curr != null && count < k) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
    }

    static Node partitionLinkedList(Node head, int k) {
        Node leftHead = new Node(-1);
        Node rightHead = new Node(-1);

        Node leftTail = leftHead;
        Node rightTail = rightHead;

        Node curr = head;

        while (curr != null) {
            if (curr.data < k) {
                leftTail.next = curr;
                leftTail = curr;
            } else {
                rightTail.next = curr;
                rightTail = curr;
            }
            curr = curr.next;
        }
        rightTail.next = null;
        leftTail.next = rightHead.next;

        return leftHead.next;
    }
}
