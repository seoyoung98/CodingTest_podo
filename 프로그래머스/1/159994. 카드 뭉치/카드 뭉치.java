import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> cards1_list = new ArrayList<>(Arrays.asList(cards1));
        List<String> cards2_list = new ArrayList<>(Arrays.asList(cards2));
        
        for(String g : goal){
            if((!cards1_list.isEmpty()) && (g.equals(cards1_list.get(0)))) {
            	cards1_list.remove(0);
            }
            else if((!cards2_list.isEmpty()) && (g.equals(cards2_list.get(0)))) {
            	cards2_list.remove(0);
            }else {
            	return "No";
            }
        }
        
        return "Yes";
    }
}