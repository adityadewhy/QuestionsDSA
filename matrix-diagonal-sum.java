#https://leetcode.com/problems/matrix-diagonal-sum/submissions/966068375/

# 44.1MB 0ms

class Solution{

public int diagonalSum(int[][] mat) {
    int len = mat.length;
    int mid = len/2;

    int sum = 0;

    if(len == 1){
        return mat[0][0];

    }else{int start = 0;
        int end = len - 1;
        for (int row = 0; row < mid; row++) {
            sum += mat[row][start];
            sum += mat[row][end];

            start += 1;
            end -= 1;
        }

        start = 0;
        end = len - 1;
        for (int row = (len - 1); row >= mid; row--) {
            if(start == end){
                sum += mat[row][start];
            }else{
                sum += mat[row][start];
                sum += mat[row][end];
            }           
            start = start+1;
            end = end-1;
        }
    }
    return sum;
}
}
