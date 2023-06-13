//https://leetcode.com/problems/spiral-matrix-ii/submissions/970392154/

// 40.5MB 0ms

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int itop = 0;
        int ibottom = n-1;
        int iright = n-1;
        int ileft = 0;

        int element = 1;

        while(element <= n*n){
            while(true){
                for(int i = ileft ; i <= iright ; i++) {
                    matrix[itop][i] = element ;
                    element++;
                    }
                itop++;
                break;
            }
            while(true){
                for(int i = itop ; i <= ibottom ; i++){
                    matrix[i][iright]=element;
                    element++;
                }
                iright--;
                break;
            }
            while(true){
                for(int i = iright ; i >= ileft ; i--){
                    matrix[ibottom][i]=element;
                    element++;
                }
                ibottom--;
                break;
            }
            while(true){
                for(int i = ibottom ; i >= itop ; i--){
                    matrix[i][ileft]=element;
                    element++;
                }
                ileft++;
                break;
            }
        }
        return matrix;
    }
}
