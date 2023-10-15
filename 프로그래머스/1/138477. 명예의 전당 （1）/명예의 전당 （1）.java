import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList<Integer> solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++) {
        	answer.add(score[i]);
        	Collections.sort(answer,Collections.reverseOrder());
        	if(answer.size() >= k) result.add(answer.get(k-1));
        	else if (answer.size() < k) result.add(answer.get(answer.size()-1));
        }
        
        return result;
    }
}