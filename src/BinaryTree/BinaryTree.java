package BinaryTree;

import Node.Node;

public class BinaryTree {
    /*
  Tree:
         1
       /    \
      2       3
    /   \    /  \
   4     5  6    7

     * Inorder (LDR):   4,2,5,1,6,3,7
     * Preorder (DLR):  1,2,4,5,3,6,7
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

    static int minimumInATree(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        int left = minimumInATree(root.getLeft());
        int right = minimumInATree(root.getRight());

        return Math.min(Math.min(left, right), root.getData());
    }

    static int heightOfABinaryTree(Node root) {
        if (root == null) return 0;
        int hl = heightOfABinaryTree(root.getLeft());
        int hr = heightOfABinaryTree(root.getRight());
        return Math.max(hl, hr) + 1;
    }


    private static Node xParent, yParent;
    private static int xLevel, yLevel;

    static void areCousinsHelper(Node node, Node parent, int x, int y, int level) {
        if (node == null) return;

        if (node.getData() == x) {
            xParent = parent;
            xLevel = level;
        }

        if (node.getData() == y) {
            yParent = parent;
            yLevel = level;
        }

        areCousinsHelper(node.getLeft(), node, x, y, level + 1);
        areCousinsHelper(node.getRight(), node, x, y, level + 1);
    }

    static boolean checkAreCousins(Node root, int x, int y) {
        /*
         *      1
         *    /   \
         *   2     3   // 2 and 3 are not cousins, although they are on same level but their parent is same i.e 1
         *    \     \
         *     4     5  // 4 and 5 are cousins because they are on same level and have different parent
         *
         * */

        areCousinsHelper(root, null, x, y, 0);
        boolean onSameLevel = xLevel == yLevel;
        boolean differentParent = xParent != yParent;

        return onSameLevel && differentParent;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);

        root.setLeft(n1);
        root.setRight(n2);
        n1.setRight(n3);
        n2.setRight(n4);

//        inorder(root);
//        preOrder(root);
//        postOrder(root);
//        System.out.println(minimumInATree(root));
//        System.out.println(heightOfABinaryTree(root));
        System.out.println(checkAreCousins(root, n3.getData(), n4.getData()));

    }
}
