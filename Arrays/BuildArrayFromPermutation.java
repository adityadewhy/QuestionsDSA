//https://leetcode.com/problems/build-array-from-permutation/submissions/958616442/

class Solution {
    public int[] buildArray(int[] nums) {
        int[] newnums = new int[nums.length];

        for(int i = 0; i<=(nums.length-1); i++){
            newnums[i]=nums[nums[i]];
        }

        return newnums;
    }
}
