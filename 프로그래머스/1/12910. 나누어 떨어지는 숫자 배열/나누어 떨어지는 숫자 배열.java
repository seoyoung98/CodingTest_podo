import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();
        
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i]% divisor == 0) {
        		list.add(arr[i]);
        	}
        }
        list.sort(null);
        if(list.isEmpty()) list.add(-1);
        
        int listSize = list.size();
        int[] answer = new int[listSize];
        
        for(int i = 0; i < listSize; i++) {
        	answer[i] = list.get(i); 
        }
        
        return answer;
    }
}