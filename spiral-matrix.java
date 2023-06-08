#https://leetcode.com/problems/spiral-matrix/

// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> spiral = new ArrayList<>();
//         int matlen = matrix.length;
//         int collen = matrix[0].length;


//         int temptop = 0;
//         int tempright = collen;
//         int tempbottom = matlen;
//         int templeft = 0;

//         while (spiral.size() <= matlen*collen){

//             // top row left to right
//             for(int i = temptop ; i < matlen/2 ; i++){
//                 for(int j = templeft ; j < (tempright - 1) ; j++){
//                     spiral.add(Integer.valueOf(matrix[i][j]));
//                 }
//                 temptop++;
//                 break;
//             }
//             // Check if all elements have been visited
//             if (spiral.size() >= matlen * collen) {
//                 break;
//             }

//             // right column top to bottom
//             for(int i = temptop ; i < matlen ; i++){
//                 int j = tempright - 1;
//                 while( j == (tempright-1)){
//                     spiral.add(Integer.valueOf(matrix[i][j]));
//                     j++;
//                 }
//             }
//             tempright--;
//             // Check if all elements have been visited
//             if (spiral.size() >= matlen * collen) {
//                 break;            
//             }

//             //right bottom to left bottom
//             for(int i = (tempbottom-1) ; i > matlen/2 ; i++){
//                 for(int j = (tempright-1) ; j >= templeft ; j++){
//                     spiral.add(Integer.valueOf(matrix[i][j]));
//                 }
//                 tempbottom--;
//                 break;
//             }
//             // Check if all elements have been visited
//             if (spiral.size() >= matlen * collen) {
//                 break; 
//             }

//             //bottom left to top left
//             for(int i = (tempbottom-1) ; i > temptop ; i++){
//                 int j = templeft;
//                 while(j == templeft){
//                     spiral.add(Integer.valueOf(matrix[i][j]));
//                     j++;
//                 }
//             }
//             templeft++;
//             // Check if all elements have been visited
//             if (spiral.size() >= matlen * collen) {
//                 break; 
//         }
//     }
//     return spiral;
// }
// }

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int matlen = matrix.length;
        int collen = matrix[0].length;

        int temptop = 0;
        int tempright = collen;
        int tempbottom = matlen;
        int templeft = 0;

        while (spiral.size() < matlen * collen) {
            // top row left to right
            for (int i = temptop; i < matlen / 2; i++) {
                for (int j = templeft; j <= (tempright - 1); j++) {
                    spiral.add(Integer.valueOf(matrix[i][j]));
                }
                temptop++;
                break;
            }
            
            // Check if all elements have been visited
            if (spiral.size() >= matlen * collen) {
                break;
            }

            // right column top to bottom
            for (int i = temptop; i < matlen; i++) {
                int j = tempright - 1;
                while (j >= templeft) {
                    spiral.add(Integer.valueOf(matrix[i][j]));
                    j--;
                }
            }
            tempright--;
            
            // Check if all elements have been visited
            if (spiral.size() >= matlen * collen) {
                break;
            }

            // right bottom to left bottom
            for (int i = (tempbottom - 1); i > matlen / 2; i++) {
                for (int j = (tempright - 1); j >= templeft; j--) {
                    spiral.add(Integer.valueOf(matrix[i][j]));
                }
                tempbottom--;
                break;
            }
            
            // Check if all elements have been visited
            if (spiral.size() >= matlen * collen) {
                break;
            }

            // bottom left to top left
            for (int i = (tempbottom - 1); i > temptop; i--) {
                int j = templeft;
                while (j == templeft) {
                    spiral.add(Integer.valueOf(matrix[i][j]));
                    j++;
                }
            }
            templeft++;
            
            // Check if all elements have been visited
            if (spiral.size() >= matlen * collen) {
                break;
            }
        }
        return spiral;
    }
}
