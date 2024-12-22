package linkedlist;

/*
Linked list are not stored in contigious location
 */

public class LinkedListBasic {

    static void traverseInLinkedList (Node <Integer> head){
        Node<Integer> cur = head;
        while(cur!=null){
            System.out.print(cur.data +"-->");
            cur= cur.next;

        }
        System.out.println("End");
    }

    static Node <Integer> insertInLinkedList(int data, int position, Node <Integer> head){
        Node <Integer> newNode = new Node<>(data);
        if(position ==0){
            newNode.next = head;
            head = newNode;
            return  head;
        }
        Node <Integer> curr = head;
        for (int i = 0; i <position-1 ; i++) {
            curr= curr.next;
            if(curr == null) return head;

        }
        newNode.next = curr.next;
        curr.next=newNode;

        return head;

    }


    static Node<Integer> deletInLinkedList(int position, Node<Integer> head){
        if(head==null) return null;

        if(position==0){
            head = head.next;
            return head;
        }
        Node<Integer> curr = head;
        for (int i = 0; i < position-1 ; i++) {
           curr= curr.next;
        }
        curr.next = curr.next.next;
        return head;


    }

    static int findMiddleLinkedlIst(Node<Integer> head){
        Node <Integer> slow = head;
        Node <Integer> fast = head;

        while(fast!=null & fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow.data;
    }


    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node <Integer> n2 = new Node <Integer> (20);
        Node <Integer> n3 = new Node <Integer> (30);
        Node <Integer> n4 = new Node <Integer>(40);
        Node <Integer> n5 = new Node <Integer>(50);
        Node <Integer> n6 = new Node <Integer>(60);
        Node <Integer> n7 = new Node <Integer>(70);


        Node <Integer> head = n1;
        n1.next= n2;
        n2.next= n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next=n7;

        traverseInLinkedList(head);
//      head =insertInLinkedList(100,3,head);
//        head=deletInLinkedList(3,head);
//        traverseInLinkedList(head);
        System.out.println(findMiddleLinkedlIst(head));
    }}

class Node<T>{
    T data ;
    Node next;

    public Node(T data){
        this.data = data;
    }

}