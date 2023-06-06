# https://leetcode.com/problems/flipping-an-image/submissions/965335370/

# 43.8MB 1ms

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        //reverse
        int len = image.length;
        
        //why is it that we need to specify both col length and row length here, even though specifying the len of inner array(col) is not said to be necessary in a 2d matrix?
        int[][] reverse = new int[len][len];

        for(int row = 0 ; row<len ; row++){
            int counter = 0;
            for (int col = len-1 ; col>=0 ; col--){
                reverse[row][counter] = image[row][col];
                counter++;
            }
        }

        //flip
        for (int row = 0 ; row < len ; row++){
            for (int col = 0 ; col < len ; col++){
                if( reverse[row][col] == 0){
                    reverse[row][col] = 1;
                }else{
                    reverse[row][col]=0;
                }
            }
        }

        return reverse;
    }
}
