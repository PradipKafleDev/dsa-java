package recursion;


public class FindPathInMatrix {
    /*
    RULE: we can only go/travel either RIGHT or DOWN

     */

    static int countPathInMatrix(int row, int col) {

        // base case if we have row 1 and col 1 then the number of path to get to the destination will be 1;
        if (row == 1 || col == 1) return 1;

        //finding the number of possible paths from right side in matrix;
        int rightSideCount = countPathInMatrix(row, col - 1);
        //finding the number of possible paths from downside in matrix;
        int downSideCount = countPathInMatrix(row - 1, col);

        return rightSideCount + downSideCount;


    }

    public static void main(String[] args) {

        System.out.println(countPathInMatrix(3, 4));

    }
}
