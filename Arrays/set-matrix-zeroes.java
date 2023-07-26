/*
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
*/
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean isrow0 = false;
        boolean iscol0 = false;

        for(int i = 0 ; i < rows ; i++){
            if(matrix[0][i] == 0){
                isrow0 = true;
            }
        }

        for(int i = 0 ; i < cols ; i++){
            if(matrix[i][0] == 0){
                iscol0 = true;
            }
        }

        for(int i = 1 ; i < rows ; i++){
            for(int j = 1 ; j < cols ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1 ; i < rows ; i++){
            for(int j = 1 ; j < cols ; j++){
                if(matrix[0][i] == 0){
                    matrix[i][j] = 0;
                }
                if(matrix[j][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(isrow0 == true){
            for(int i = 0; i < rows ; i++){
                matrix[0][i] = 0;
            }
        }
        if(iscol0 == true){
            for(int i = 0; i < cols ; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
