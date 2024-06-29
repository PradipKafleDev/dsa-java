package BinaryTree;

import Node.Node;

public class BinaryTree {
    /*
    Tree:
         1
       /    \
      2       3
    /   \    / \
   4     5  6   7

     * Inorder (LDR): 4,2,5,1,6,3,7
     * Preorder (DLR): 1,2,4,5,3,6,7
     * PostOrder (LRD): 4,5,2,6,7,3,1
     */


    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.getLeft());
        System.out.print(root.getData() + " --> ");
        inorder(root.getRight());
    }

    static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.getData() + " --> ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData() + " --> ");
    }

    static int minimumInATree(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int left = minimumInATree(root.getLeft());
        int right = minimumInATree(root.getRight());

        return Math.min(Math.min(left, right), root.getData());
    }

    public static void main(String[] args) {
        Node root = new Node(11);
        Node n1 = new Node(12);
        Node n2 = new Node(13);
        Node n3 = new Node(4);
        Node n4 = new Node(15);
        Node n5 = new Node(16);
        Node n6 = new Node(17);

        root.setLeft(n1);
        root.setRight(n2);
        n1.setLeft(n3);
        n1.setRight(n4);
        n2.setLeft(n5);
        n2.setRight(n6);

//      inorder(root);
//      preOrder(root);
//      postOrder(root);
        System.out.println(minimumInATree(root));

    }
}
