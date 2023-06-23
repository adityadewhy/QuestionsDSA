# https://leetcode.com/problems/count-items-matching-a-rule/submissions/962619212/

#1 47.1MB 7ms

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String[] type = new String[items.size()];
        String[] color = new String[items.size()];
        String[] name = new String[items.size()];

        for( int i = 0 ; i < (items.size()); i++){
            type[i] = items.get(i).get(0);
        }
        for( int i = 0 ; i < (items.size()); i++){
            color[i] = items.get(i).get(1);
        }
        for( int i = 0 ; i < (items.size()); i++){
            name[i] = items.get(i).get(2);
        }

        int counter = 0;

        if(ruleKey.equals("type")){
            for (int i=0 ; i<type.length ; i++){
                if(type[i].equals(ruleValue)){
                    counter++;
                }
            }
        }else if(ruleKey.equals("color")){
            for (int i=0 ; i<color.length ; i++){
                if(color[i].equals(ruleValue)){
                    counter++;
                }
            }
        }else{
            for (int i=0 ; i<name.length ; i++){
                if(name[i].equals(ruleValue)){
                    counter++;
                }
            }
        }
        return counter;
        }
    }
    
###########################################################################################

#2 3ms 47.5MB

class Solution {
    public int countMatches(List<List<String>> s, String k, String v) {
        int c=0;
        int x=0;
        int n=s.size();
        String a[]={"type","color","name"};
        if(k.equals("type")){
            x=0;
        }
        else if(k.equals("color")){
            x=1;
        }
        else if(k.equals("name")){
            x=2;
        }
        for(int i=0;i<n;i++){
            if(s.get(i).get(x).equals(v)){
                c++;
            }
        }
        return c;
    }
}
