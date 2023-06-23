#https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/962383138/

#1 41MB 4ms

class Solution {
    public boolean checkIfPangram(String sentence) {
        return (sentence.chars().distinct().count()) == 26;
    }
}

#40MB
class Solution {
    public boolean checkIfPangram(String sentence) {
        char val = 'a';
        for(int i=1;i<=26;i++){
            if(sentence.indexOf(val) == -1){
                return false;
            }
            val++;
            //how exactly does 'a' increment. its not a number afterall.?
        }
        return true;
    }
}
