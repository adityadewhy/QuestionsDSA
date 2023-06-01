#https://leetcode.com/problems/create-target-array-in-the-given-order/submissions/

#################################################################################

# 41.1MB 2ms

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> listtarget = new ArrayList<>();
        for ( int num = 0 ; num < nums.length ; num++){
            listtarget.add(index[num] , nums[num]); 
        }
        System.out.print(listtarget);
        int[] target = new int[listtarget.size()];
        for( int i = 0 ; i < listtarget.size() ; i++){
            target[i] = listtarget.get(i);
        }
        return target;
    }
}
