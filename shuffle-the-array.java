//iteration1 - Memory 43.9MB runtime 5ms

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newnums1 = new int[(nums.length)/2];
        int[] newnums2 = new int[(nums.length)/2];
        int[] newnums = new int[(nums.length)];

        //newnums1
        for(int i = 0 ; i < newnums1.length ; i++){
            newnums1[i] = nums[i];
        }

        //newnums2
        for(int i = 0; i < newnums2.length ; i++){
            newnums2[i] = nums[n+i];
        }

        //newnums
        int counter1 = 0;
        int counter2 = 0;
        for(int i = 0 ; i < newnums.length ; i++){
            if(i % 2 != 0){
                newnums[i] = newnums2[counter2];
                counter2++;
            }else{
                newnums[i] = newnums1[counter1];
                counter1++;
            }
        }
        System.out.println(Arrays.toString(newnums1));  //not needed
        System.out.println(Arrays.toString(newnums2));  //not needed
        return newnums;
    }
}
