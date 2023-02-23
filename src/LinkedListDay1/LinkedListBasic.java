package LinkedListDay1;

public class LinkedListBasic {

    static void traverseInLinkedList (Node<Integer> head){
        Node <Integer>curr = head;
        while(curr!= null){
            System.out.print(curr.data +"-->");
            curr=curr.next;

        }
        System.out.println("End");
    }

    static void insertInLinkedList(int data, int position, Node<Integer> head){
        Node<Integer> newNode = new Node(data);

        if(position ==0){
            newNode.next = head;
            head = newNode;
            return;

        }
        Node <Integer>curr = head;

        for(int i =0; i<position-1; i++){
            curr=curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;


    }

    public static void main(String[] args) {
        Node<Integer> n1= new Node<Integer>(10);
        Node<Integer> n2= new Node<Integer>(20);
        Node<Integer> n3= new Node<Integer>(30);
        Node<Integer> n4= new Node<Integer>(40);
        Node<Integer> n5= new Node<Integer>(50);
        Node<Integer> n6= new Node<Integer>(60);


        Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;


         traverseInLinkedList(head);
        insertInLinkedList(100,3,head);
        traverseInLinkedList(head);

    }}

class Node<T>{
    T data;
    Node  next;

    public Node (T data){
        this.data = data;
    }
}