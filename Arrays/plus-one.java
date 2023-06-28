//https://leetcode.com/problems/plus-one/

/*
class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int num : digits){
            sb.append(num);
        }
        String digitsS = sb.toString();
        int digitsI = Integer.parseInt(digitsS);

        int ansI = digitsI + 1;
        
        String ansS = String.valueOf(ansI);
        int lenS = ansS.length();

        int[] ans = new int[lenS];
        for (int i = 0; i < lenS; i++) {
            char digitChar = ansS.charAt(i); 
            // Get the character at each position
            int digit = Character.getNumericValue(digitChar); 
            // Convert the character to an integer
            ans[i] = digit; 
            // Store the digit in the int array
        }
        return ans;
    }
}
*/
