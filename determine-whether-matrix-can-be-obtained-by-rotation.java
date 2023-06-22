/*
intuition
When a square matrix of size n is rotated by 90 degrees:

Once: The rows of the original matrix become the columns of the rotated matrix in reverse order.

Twice: The original matrix is rotated by 180 degrees, which means the rows and columns are reversed. The elements that were in the top-left corner of the original matrix will be in the bottom-right corner of the rotated matrix.

Thrice: The matrix is rotated by 270 degrees, which is equivalent to rotating it once in the opposite direction (clockwise) by 90 degrees. The rows of the original matrix become the columns of the rotated matrix in their original order, but in reverse order from bottom to top.

Regardless of the number of rotations (multiples of 90 degrees), the common observation is that the rows of the original matrix become the columns of the rotated matrix, and their order may be reversed depending on the number of rotations.
*/

// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/submissions/977390924/

// 41.1 MB

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int len = mat.length;
        int total = len * len;
        return rotate1(mat, target, len, total);
    }

    // First rotation.
    // rows become columns and columns in reverse
    private boolean rotate1(int[][] mat, int[][] target, int len, int total) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (mat[i][j] != target[j][len - 1 - i]) {
                    return rotate2(mat, target, len, total);
                } else {
                    count += 1;
                }
            }
        }
        return count == total;
    }

    //second rotation  
    //rows remain rows, columns remain columns but both reverse
    private boolean rotate2(int[][] mat, int[][] target, int len, int total) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (mat[i][j] != target[len-1-i][len-1-j]) {
                    return rotate3(mat, target, len, total);
                } else {
                    count += 1;
                }
            }
        }
        return count == total;
    }

    //third rotation   
    //rows become columns (but in reverse) 
    private boolean rotate3(int[][] mat, int[][] target, int len, int total) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (mat[i][j] != target[len-1-j][i]) {
                    return rotate4(mat, target, len, total);
                } else {
                    count += 1;
                    System.out.println("r3");
                }
            }
        }
        return count == total;
    }

    private boolean rotate4(int[][] mat, int[][] target, int len, int total) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                } else {
                    count += 1;
                }
            }
        }
        return count == total;
    }
}
