package linkedlist;

/*
Linked list are not stored in contiguous location
 */

public class LinkedListBasic {

    static void traverseInLinkedList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "-->");
            cur = cur.next;

        }
        System.out.println("End");
    }

    static Node insertInLinkedList(int data, int position, Node head) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node curr = head;
        for (int i = 0; i < position - 1; i++) {
            curr = curr.next;
            if (curr == null) return head;

        }
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    static Node deleteInLinkedList(int position, Node head) {
        if (head == null) return null;

        if (position == 0) {
            head = head.next;
            return head;
        }
        Node curr = head;
        for (int i = 0; i < position - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;
    }

    static Node findMiddleLinkedlist(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);
        Node n7 = new Node(70);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        traverseInLinkedList(head);
//      head =insertInLinkedList(100,3,head);
//        head=deletInLinkedList(3,head);
//        traverseInLinkedList(head);
        System.out.println(findMiddleLinkedlist(head));
    }

}
