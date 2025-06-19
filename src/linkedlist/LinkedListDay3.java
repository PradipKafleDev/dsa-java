package linkedlist;

import template.Node;

import static linkedlist.LinkedListBasic.printLinkedList;
import static linkedlist.LinkedlistDay2.reverseLinkedList;

public class LinkedListDay3 {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);


        Node head2 = new Node(9);
        head2.next = new Node(4);

        Node result = reorderLinkedList(head1);
//      Node result = addTwoNumberInLinkedList(head1, head2);
        printLinkedList(result);
    }

    static Node addTwoLinkedList(Node l1, Node l2) {
        Node rL1 = reverseLinkedList(l1);
        Node rL2 = reverseLinkedList(l2);
        int carry = 0;
        Node ans = null;
        Node temp = null;

        while (rL1 != null || rL2 != null || carry != 0) {
            int sum = carry;
            if (rL1 != null) {
                sum += rL1.data;
                rL1 = rL1.next;
            }

            if (rL2 != null) {
                sum += rL2.data;
                rL2 = rL2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;

            Node newNode = new Node(digit);
            if (ans == null) {
                ans = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        return reverseLinkedList(ans);
    }

    static Node reorderLinkedList(Node head) {
        // 1 2 3 4 5
        // 5 4 3 2 1
        // 1 5 2 4 3
        Node slow = head;
        Node fast = head;

        while(fast != null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node l2 = reverseLinkedList(slow);
        Node l1 = head;

        while (true){
            if(l1 == l2){
                l1.next = null;
                break;
            }
            Node l1Next = l1.next;
            Node l2Next = l2.next;
            l1.next = l2;
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }
         return head;
    }

}
