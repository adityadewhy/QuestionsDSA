// https://leetcode.com/problems/add-to-array-form-of-integer/submissions/971164216/

// ! none of my approaches were working

// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k) {
//         List<Integer> ans = new ArrayList<>();

//         long number = 0;
//         for(int i = 0 ; i < num.length ; i++){
//             number += num[i]*(Math.pow(10,num.length-1-i));
//         }
//         number += k;

//         long tempnum = number;
//         while(tempnum > 0){
//             ans.add(0, (int)(tempnum % 10));
//             tempnum = tempnum/10;
//         }
//         return ans;
//     }
// }

// import java.math.BigInteger;
// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k) {
//         List<Integer> ans = new ArrayList<>();

//         BigInteger number = BigInteger.ZERO;
//         for (int i = 0; i < num.length; i++) {
//             number = number.add(BigInteger.valueOf(num[i]).multiply(BigInteger.TEN.pow(num.length - 1 - i)));
//         }
//         number = number.add(BigInteger.valueOf(k));

//         BigInteger tempnum = number;
//         while (tempnum.compareTo(BigInteger.ZERO) > 0) {
//             ans.add(0, tempnum.mod(BigInteger.TEN).intValue());
//             tempnum = tempnum.divide(BigInteger.TEN);
//         }

//         return ans;
//     }
// }

//copied ans. redo this ques

// 4ms 45.7MB
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            ans.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while (k > 0) {
            ans.add(0, k % 10);
            k /= 10;
        }
        return ans;
    }
}
