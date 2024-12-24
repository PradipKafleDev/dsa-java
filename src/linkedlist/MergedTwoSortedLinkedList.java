package linkedlist;

public class MergedTwoSortedLinkedList {

    static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "----->");
            curr = curr.next;

        }
        System.out.println();

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

        Node head1 = new Node(10);
        head1.next = new Node(30);
        head1.next.next = new Node(50);
        head1.next.next.next = new Node(70);


        Node head2 = new Node(20);
        head2.next = new Node(30);
        head2.next.next = new Node(40);
        head2.next.next.next = new Node(50);

        Node head = mergedTwoSortedLinkedList(head1, head2);
        printLinkedList(head);


    }
}
