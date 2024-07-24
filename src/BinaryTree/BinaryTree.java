package BinaryTree;

import Node.Node;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    static void printAllNodesAtALevelKRecursive(Node root, int level, ArrayList<Integer> ans) {
        if (root == null || level < 0) return;

        if (level == 0) {
            ans.add(root.getData());
        }

        printAllNodesAtALevelKRecursive(root.getLeft(), level - 1, ans);
        printAllNodesAtALevelKRecursive(root.getRight(), level - 1, ans);
    }

    static class Pair {
        Node node;
        int level;

        public Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    static List<Integer> printAllNodesAtALevelKIterative(Node root, int level) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayDeque<Pair> stack = new ArrayDeque<>();

        Pair first = new Pair(root, level);
        stack.push(first);

        while (!stack.isEmpty()) {
            Pair curr = stack.poll();
            if (curr.node == null) continue;
            if (curr.level == 0) {
                ans.add(curr.node.getData());
                continue;
            }

            stack.push(new Pair(curr.node.getRight(), curr.level - 1));
            stack.push(new Pair(curr.node.getLeft(), curr.level - 1));

        }

        return ans;
    }

    static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node temp = stack.pop();

            if (temp.getRight() != null) {
                stack.push(temp.getRight());
            }

            if (temp.getLeft() != null) {
                stack.push(temp.getLeft());
            }
        }
        System.out.println(stack);
        return res;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);
        root.setLeft(n1);
        root.setRight(n2);
        n1.setLeft(n3);
        n1.setRight(n4);
        n2.setLeft(n5);
        n2.setRight(n6);

//        inorder(root);
//        preOrder(root);
//        postOrder(root);
//        System.out.println(minimumInATree(root));
//        System.out.println(heightOfABinaryTree(root));
//        System.out.println(checkAreCousins(root, n3.getData(), n4.getData()));]
//        ArrayList<Integer> ans = new ArrayList<>();
//        printAllNodesAtALevelK(root, 1, ans);
//        System.out.println(ans);
//        System.out.println(printAllNodesAtALevelKIterative(root, 2));
        System.out.println(inOrder(root));
    }
}
