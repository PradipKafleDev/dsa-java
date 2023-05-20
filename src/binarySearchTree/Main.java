package binarySearchTree;

public class Main {

    static boolean isPresent(Node root, int key){
        if(root== null) return false;
        System.out.print(root.data + "---->");
        if(root.data==key) return true;
        if(key > root.data){
            return isPresent(root.right,key);
        }
        return isPresent(root.left ,key);
    }

    static boolean IterativeIsPresent(Node root, int key){
        if(root == null) return false;
         Node currentNode = root;
         while(currentNode != null){
             if(currentNode.data == key) return  true;
             if(key> currentNode.data) currentNode= currentNode.right;
             else currentNode= currentNode.left;

         }
         return  false;


    }


    public static void main(String[] args) {
        Node root = new Node (50);
        root.left = new Node (30);
        root.right= new Node (80);
        root.left.left = new Node (20);
        root.left.right = new Node (40);
        root.right.left = new Node(70);
        root.right.right = new Node(100);
        root.right.left.left= new Node(60);

//        System.out.println(isPresent(root,10));
        System.out.println(isPresent(root,10));

    }




}
class Node{
    int data;
    Node left;
    Node right;

    public Node (int data){
        this.data = data;
    }
}
