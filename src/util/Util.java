package util;

public final class Util {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
        }
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
}


