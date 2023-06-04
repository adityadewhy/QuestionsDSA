# https://leetcode.com/problems/find-the-highest-altitude/description/

class Solution {
    public int largestAltitude(int[] gain) {
        int[] alts = new int[(gain.length)+1];
        alts[0]=0;
        for(int i=1 ; i <= gain.length ; i++){
            alts[i]=gain[i-1]+alts[i-1];
        }
        System.out.println(Arrays.toString(alts));
        return Arrays.stream(alts).max().getAsInt();
        
    }
}
