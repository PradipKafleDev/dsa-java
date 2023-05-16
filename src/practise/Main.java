package practise;


public class Main {

    static Node insertAtBeginning(Node head, int data){

        Node newHead = new Node(data);
        Node temp = head;
        head= newHead;
        newHead.next= head;

        return newHead;

    }

    static void traverseLL(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+ "------>");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {

        Node n1 = new Node (10);
        Node n2 = new Node (20);
        Node n3 = new Node (30);
        Node n4 = new Node (40);
        Node n5 = new Node (50);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next= n5;

      Node ans=  insertAtBeginning(head,12);
      traverseLL(ans);





    }

}

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
