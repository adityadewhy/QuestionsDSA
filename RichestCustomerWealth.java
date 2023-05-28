#https://leetcode.com/problems/richest-customer-wealth/submissions/958999254/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        for(int person=0 ; person < accounts.length ; person++){
            for (int banks=0 ; banks < accounts[person].length ; banks++){
                wealth[person] += accounts[person][banks];
            }
        }
        return Arrays.stream(wealth).max().getAsInt();
    }
}
