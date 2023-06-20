package recursion;


class RatInAMaze {


    public static boolean ratInAMaze(int[][] a, boolean[][] isVisited, int row, int col) {


        //Base condition when we go out of the matrix length or when i and j is o and when we already visited that position return false
        if (row == a.length || col == a.length || a[row][col] == 0 || isVisited[row][col]) {
            return false;
        }


        //base condition for successfully reached to the destination
        if (row == a.length - 1 && col == a.length - 1) return true;


        //Mark this cell as visited
        isVisited[row][col] = true;

        ///check if path is possible from right
        if (ratInAMaze(a, isVisited, row, col + 1)) return true;

        //check if path is possible from down
        if (ratInAMaze(a, isVisited, row + 1, col)) return true;


        //mark this cell as unvisited & backtrack
        isVisited[row][col] = false;

        return false;


    }

    public static void main(String[] args) {
        //here 0 means block and 1 means there is a path
        int[][] a = {
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 0},
                {1, 1, 1, 1},
        };
        boolean[][] isVisited = new boolean[a.length][a.length];
        boolean isPathPossible = ratInAMaze(a, isVisited, 0, 0);
        System.out.println(isPathPossible);
    }
}
