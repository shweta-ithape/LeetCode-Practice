class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] temp = new int[n][n];
        int newCol;
        int newRow;

        for(int i = 0; i < n ;i++){
            for(int j = 0; j < n ; j++){
                newCol = (j - rowShift[i] + n) % n;
                temp[i][newCol] = grid[i][j];
            }
        }

        int[][] result = new int[n][n];

        for(int i = 0; i < n ;i++){
            for(int j = 0; j < n ; j++){
                newRow = (i - colShift[j] + n) % n;
                result[newRow][j] = temp[i][j];
            }
        }

        return result;
    }
}