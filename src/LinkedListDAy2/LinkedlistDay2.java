package LinkedListDAy2;

public class LinkedlistDay2 {

    static Node reverseLinkedList(Node head){
        Node curr = head,prev=null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }


    static Node reverseRecursiveLinkedList(Node head){
        if(head==null || head.next == null) return head;
        Node temp = head.next;
        Node newHead = reverseRecursiveLinkedList(head.next);
        temp.next = head;
        head.next = null;
        return newHead;

    }

    static void printLinkedList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data +" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(30);
        head.next.next.next = new Node (40);

        printLinkedList(head);
//        Node newHead = reverseLinkedList(head);
        Node newHead= reverseRecursiveLinkedList(head);
        printLinkedList(newHead);

    }

}

class Node{
    int data;
    Node next;

    public  Node(int data){
        this.data = data;
    }
}
