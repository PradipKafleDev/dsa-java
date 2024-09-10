package practise;


public class Main {

    public static void main(String[] args) {
        String name = "pradip";
        String name1 = "pradi";
        System.out.println(hashFn(name));
    }

    static int hashFn(String str) {
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash = hash * 31 + str.charAt(i);
        }
        return hash;
    }

}

