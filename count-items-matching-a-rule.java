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
