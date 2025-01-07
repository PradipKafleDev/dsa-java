package recursion;

public class CountOccurrences {

    public static void main(String[] args) {
        String s = "ababbabac";
        String t = "aba";
        int result = countOccurrence(s, t);
        System.out.println(result);
    }

    private static int countOccurrence(String str, String target) {
        return countOccurrenceHelper(str, target, 0);
    }

    private static int countOccurrenceHelper(String s, String t, int i) {
        if (i > s.length() - t.length()) {
            return 0;
        }
        /*
        return 2;
        i = 0  ababbabac --> check s.startsWith(t, i) yes so, 1 + 1 = 2 go ^
        i = 1  babbabac --> check s.startsWith(t, i) no still 1 go ^
        1 = 2  abbabac --> check s.startsWith(t, i) no still 1 go ^
        i = 3  bbabac --> check s.startsWith(t, i) no still 1 go ^
        i = 4  babac -> check s.startsWith(t, i) no still 1 go ^
        i = 5  abac --> check s.startsWith(t, i) yes 0 + 1 = 1 go ^;
        i = 6  bac --> check s.startsWith(t, i) no go ^
        i = 7  ac  --> we stop here: 7 is > then 6 ( 9 - 3) and return 0; go ^
         */

        int subProblemAnswer = countOccurrenceHelper(s, t, i + 1);
        boolean doStartingCharMatch = s.startsWith(t, i);

        if (doStartingCharMatch) return subProblemAnswer + 1;

        return subProblemAnswer;
    }

}
