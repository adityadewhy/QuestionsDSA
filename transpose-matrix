//https://leetcode.com/problems/transpose-matrix/submissions/970478764/

// 44.3MB 0ms

class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] ans = new int[cols][rows];

        for(int row = 0 ; row < rows ; row++){
            for(int col = 0 ; col < cols ; col++){
                ans[col][row] = matrix[row][col];
            }
        }
        return ans;
    }
}
