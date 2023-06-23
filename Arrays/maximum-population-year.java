//https://leetcode.com/problems/maximum-population-year/submissions/973303180/

//40.5MB
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] tally = new int[101];
        //2050-1950

        for (int i = 0 ; i < logs.length ; i++){
            for (int j = logs[i][0] ; j < logs[i][1] ; j++){
                tally[j-1950] += 1;
            }
        }
        System.out.println(Arrays.toString(tally));
        int maxyear = logs[0][0];
        int maxpop = 0;
        for (int i = 0 ; i < 101 ; i++){
            if(tally[i] > maxpop){
                maxpop = tally[i];
                maxyear = i+1950;
            }
        }
        return maxyear;
    }

    //
class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] tally = new int[101];
        //2050-1950

        for (int i = 0 ; i < logs.length ; i++){
            tally[logs[i][0] - 1950]++;
            tally[logs[i][1] - 1950]--;
        }
        //only increasing at birth year and decreasing at death year

        //running sum
        for(int i = 1 ; i < 101 ; i++){
            tally[i] += tally[i-1];
        }

        int maxyear = 0;
        int maxpop = 0;
        for(int i = 0 ; i < 101 ; i++){
            if(tally[i] > maxpop){
                maxpop = tally[i];
                maxyear = 1950+i;
            }
        }
        return maxyear;
    }
}
