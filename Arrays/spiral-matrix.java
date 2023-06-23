https://leetcode.com/problems/spiral-matrix/submissions/968957463/

#140.3MB 0ms

class Solution{
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> spiral = new ArrayList<>();
            int matlen = matrix.length;
            int collen = matrix[0].length;
            int totalElements = matlen * collen;
            
            int itop = 0;
            int ibottom = matlen-1;
            int iright = collen-1;
            int ileft = 0;
            
            while (spiral.size() < totalElements) {
                
                //top left to top right
                while(true){
                    for(int i = ileft ; i <= iright ; i++) {
                        spiral.add(Integer.valueOf(matrix[itop][i]));
                    }
                    itop++;
                    break;
                }
                //check if all elements have been added
                if (spiral.size() >= totalElements){
                    break;
                }
                
                //top right to bottom right
                while(true){
                    for(int i = itop ; i <= ibottom ; i++){
                        spiral.add(Integer.valueOf(matrix[i][iright]));
                    }
                    iright--;
                    break;
                }
                //check if all elements have been added
                if (spiral.size() >= totalElements){
                    break;
                }
                
                //bottom right to bottom left
                while(true){
                    for (int i = iright ; i >= ileft ; i--){
                        spiral.add(Integer.valueOf(matrix[ibottom][i]));
                    }
                    ibottom--;
                    break;
                }
                //check if all elements have been added
                if (spiral.size() >= totalElements){
                    break;
                }
                
                //bottom left to top left
                while(true){
                    for (int i = ibottom ; i >= itop ; i--){
                        spiral.add(Integer.valueOf(matrix[i][ileft]));
                    }
                    ileft++;
                    break;
                }
                //check if all elements have been added
                if (spiral.size() >= totalElements){
                    break;
                }
            }
            return spiral;
        }
    }
