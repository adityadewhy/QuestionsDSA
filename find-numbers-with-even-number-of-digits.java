# https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

#1 41.8MB 5ms
# just played with constraints

class Solution {
    public int findNumbers(int[] nums) {
        int evens = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < Math.pow(10, 1) - 1) {
                evens += 0;
            } else if (nums[i] > Math.pow(10, 1) - 1 && nums[i] <= Math.pow(10, 2) - 1) {
                evens += 1;
            } else if (nums[i] > Math.pow(10, 2) - 1 && nums[i] <= Math.pow(10, 3) - 1) {
                evens += 0;
            } else if (nums[i] > Math.pow(10, 3) - 1 && nums[i] <= Math.pow(10, 4) - 1) {
                evens += 1;
            } else if (nums[i] > Math.pow(10, 4) - 1 && nums[i] <= Math.pow(10, 5) - 1) {
                evens += 0;
            } else {
                evens += 1;
            }
        }
        return evens;
    }
}
