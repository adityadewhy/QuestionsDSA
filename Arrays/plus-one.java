// https://leetcode.com/problems/plus-one/submissions/984822769/

class Solution {
    public int[] plusOne(int[] digits) {

        int last = digits.length - 1;
        
        for(int i = last ; i >= 0 ; i--){
            if(digits[i] != 9){
                digits[i] = digits[i] + 1;
                break;
            }else{
                digits[i] = 0;
            }
        }

        //this is for the case when all digits are 9. other cases will be handled by above for loop
        if(digits[0] == 0){
            int[] larger = new int[last + 2];
            larger[0] = 1;
            // the reason why we dont interfere with any other index is because by default new array have 0 at every index.
            //what we intended for this edge case was to anyway make say 99->100
            //we just have to create a bigger array with first index value 1 and rest all can anyway be 0

            return larger;
        }

        return digits;

    }
}
