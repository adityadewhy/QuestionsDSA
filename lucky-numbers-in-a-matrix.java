//https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/978146689/

//44.5MB

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int matlen = matrix.length;
        int collen = matrix[0].length;

        int[] smallrow = new int[matlen];
        for(int i = 0 ; i < matlen ; i++){
            for(int j = 0 ; j < collen ; j++){
                smallrow[i] = matrix[i][0];
            }
        }
        int[] bigcol = new int[collen];

        for(int i = 0 ; i < matlen ; i++){
            for(int j = 0 ; j < collen ; j++){
                if(matrix[i][j] < smallrow[i]){
                    smallrow[i] = matrix[i][j];
                }
            }
        }
        
        int j = 0;
        while(j < collen){
            for(int i = 0 ; i < matlen ; i++){
                if(matrix[i][j] > bigcol[j]){
                    bigcol[j] = matrix[i][j];
                }
            }
            j++;
        }

        for(int i = 0 ; i < matlen ; i++){
            for(j = 0 ; j < collen ; j++){
                if(smallrow[i] == bigcol[j]){
                ans.add(smallrow[i]);
                } 
            }  
        }

        return ans;

    }
}
