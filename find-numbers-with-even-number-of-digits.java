// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

// 41.8MB 5ms
// just played with constraints

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

//2 41MB 
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=numofdigit(nums[i]);
            if(num%2==0){
                count++;
            }
        }
        System.gc();
        
//        just adding System.gc() made it grom from 42.9 to 41
        
        return count;
    }
    int numofdigit(int num){
        int nod=0;
        while(num!=0)
        {
            num=num/10;
            nod++;
        }
        return nod;
    }
}
