package linkedlist;

public class LinkedListDay3 {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node head2 = new Node(9);
        head2.next = new Node(4);

        Node result = addTwoNumberInLinkedList(head1, head2);
        LinkedListBasic.traverseInLinkedList(result);
    }

    static Node addTwoNumberInLinkedList(Node l1, Node l2) {
        Node rL1 = LinkedlistDay2.reverseLinkedList(l1);
        Node rL2 = LinkedlistDay2.reverseLinkedList(l2);
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

        return LinkedlistDay2.reverseLinkedList(ans);
    }

}
