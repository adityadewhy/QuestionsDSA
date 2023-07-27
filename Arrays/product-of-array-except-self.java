// https://leetcode.com/problems/product-of-array-except-self/submissions/1005716530/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lproduct = new int[nums.length];
        lproduct[0] = 1;

        int[] rproduct = new int[nums.length];
        rproduct[nums.length-1] = 1;

        for (int i = 1 ; i < nums.length ; i++){
            lproduct[i] = nums[i-1] * lproduct[i-1];
        }

        for (int i = nums.length-2 ; i >= 0 ; i--){
            rproduct[i] = nums[i+1] * rproduct[i+1];
        }

        int[] ans = new int[nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            ans[i] = lproduct[i] * rproduct[i];
        }

        return ans;
    }
}
