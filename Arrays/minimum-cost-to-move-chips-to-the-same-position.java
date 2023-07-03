//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/submissions/985493374/

class Solution {
    public int minCostToMoveChips(int[] position) {
        // calcute how many pieces are at odd places and how many are at even places
        int even = 0;
        int odd = 0;
        for (int i = 0 ; i < position.length ; i++){
            if(position[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        // check where are more pieces
        // if they are at even -> move all to even
        // if they are at odd -> move all to odd
        // moving such way is because, moving odd to odd or even to even takes 0 cost but "switch" case takes 1 cost each
        // so as to lower the cost, we will move the one which are lower(even/odd)
        int more = Math.max(even , odd);

        //each movement costs 1, we have calculated position beforehand, just return the "switch" case
        if(more == even){
            return odd;
        }else{
            return even;
        }
    }
}
