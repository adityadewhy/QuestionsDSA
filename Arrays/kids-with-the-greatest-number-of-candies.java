# https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/959865097/

#1 41.9 MB 2ms

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies = Arrays.stream(candies).max().getAsInt();
        Boolean[] ans = new Boolean[candies.length];
        for(int i = 0 ; i < candies.length ; i++){
            int tempmax = 0;
            tempmax = candies[i] + extraCandies;
            if(tempmax >= maxcandies){
                ans[i] = true;
            }else{
                ans[i] = false;
            }
        }
        return Arrays.asList(ans);
    }
}
