package Stack;

public class StackUsingLinkedList {
    //Here head is null
    Node head;
    int size =0;
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
        }
    }


    ///insertion happen at head where we push the element
    void push(int element){
        Node newNode = new Node(element);
        newNode.next = head;
        head=newNode;
        size++ ;

    }


    // deletion at head is a stack pop
    int pop() throws Exception {
        if(isEmpty()) throw new Exception("Stack is Empty");
        int ans = head.data;
        head = head.next;
        size --;
        return ans;

    }
    int peek() throws Exception {
        if(isEmpty()) throw new Exception("Stack is Empty");
        return head.data;

    }
    int size(){
        return size;

    }
    boolean isEmpty(){
        return size==0;
    }

}
