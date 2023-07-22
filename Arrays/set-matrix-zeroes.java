// https://leetcode.com/problems/set-matrix-zeroes/submissions/1000793752/

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        List<Integer> locationrow = new ArrayList<>();
        List<Integer> locationcol = new ArrayList<>();

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(matrix[i][j] == 0){
                    locationrow.add(i);
                    locationcol.add(j);
                }
            }
        }

        int rowzeroes = locationrow.size();
        int colzeroes = locationcol.size();

        for (int i = 0 ; i < rowzeroes ; i++){
            for (int j = 0 ; j < cols ; j++){
                matrix[locationrow.get(i)][j] = 0;
            }
        }

        for (int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < colzeroes ; j++){
                matrix[i][locationcol.get(j)] = 0;
            }
        }
    }
}
