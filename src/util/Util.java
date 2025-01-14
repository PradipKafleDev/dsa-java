package util;

public final class Util {

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static <T> Pairs createPair(T a, T b) {
        return new Pairs(a, b);
    }

    private static class Pairs<T> {
        T a;
        T b;

        public Pairs(T a, T b) {
            this.a = a;
            this.b = b;
        }
    }

    public static class StackNode {
        public int data;
        public StackNode next;

        public StackNode(int data) {
            this.data = data;
        }
    }

}


