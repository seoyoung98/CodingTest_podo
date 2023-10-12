import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = 0; j < numbers.length; j++) {
        		if(i != j) {
        			if(!answer.contains(numbers[i] + numbers[j])) {
        				answer.add(numbers[i] + numbers[j]);
        			}
        		}
        	}
        }
        Collections.sort(answer);
        
        return answer;
    }
}