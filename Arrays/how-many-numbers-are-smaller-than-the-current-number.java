#https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/960097418/

#1 13ms 43.7MB

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];
        for (int i = 0; i < nums.length; i ++) {
            int count = 0;
            for(int num: nums) {
                count += (nums[i] > num) ? 1 : 0;
            }
            smaller[i] = count;
        }
        return smaller;
    }
}

#2 40.8MB 
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];
        for (int i = 0; i < nums.length; i ++) {
            int count = 0;
            for(int num: nums) {
                count += (nums[i] > num) ? 1 : 0;
            }
            smaller[i] = count;
        }
        return smaller;
    }
}
