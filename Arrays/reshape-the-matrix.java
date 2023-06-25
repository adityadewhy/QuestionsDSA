//https://leetcode.com/problems/reshape-the-matrix/submissions/979591889/

//44.5MB

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] ans = new int[r][c];

        int row = mat.length;
        int col = mat[0].length;

        int rowcounter = 0;
        int colcounter = 0;

/*
If the number of elements in the original matrix is different from the number of elements in thereshaped matrix, return the original matrix.
*/

        if (row * col != r * c) {
            return mat;
        }

        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                ans[i][j] = mat[rowcounter][colcounter];
                colcounter++;

                if(colcounter == col){
                    colcounter = 0;
                    rowcounter++;
                }
                
            }
        }
        return ans;
    }
}
