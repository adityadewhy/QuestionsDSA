//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/submissions/978088449/


//
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n == 1){
            ans[0] = 0;
        }else if(n % 2 == 0){
            int counter = 500 ;
            for(int i = 0 ; i < n ; i += 2){
                ans[i] = counter;
                ans[i+1] = counter * (-1);
                counter--;
            }
        }else{
            ans[(n+1)/2] = 0;
            int counter = 500;
            for(int i = 0 ; i < n/2 ; i++){
                ans[(n+1)/2 - 1 - i] = counter;
                ans[(n+1)/2 + i] = counter * (-1);
                counter--;
            }
        }
    return ans;
    }
}
