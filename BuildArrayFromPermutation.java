public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        System.out.println(int[] newArray);

    }
    public int[] buildArray(int[] nums) {

        //this will be the required array
        int[] newArray = {};

        //iterating through every element in the array and appending in the required array
        for (int i = 0; i <= (nums.length - 1); i++) {
            if(nums[i] == i){
                newArray[i] = nums[i];
            }else{
                i++;
            }
        }
        return newArray;
    }
}
