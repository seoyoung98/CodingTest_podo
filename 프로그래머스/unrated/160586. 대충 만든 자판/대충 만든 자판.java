import java.util.*;

class Solution {
	public int[] solution(String[] keymap, String[] targets) {
        
	        int[] answer = new int[targets.length];
	        HashMap<Character, Integer> keyboard = new HashMap<>();
	        for(int i = 0; i < keymap.length; i++) {
	        	for(int j = 0; j < keymap[i].length(); j++) {
	        		if(!keyboard.containsKey(keymap[i].charAt(j))) { // 없으면 추가
		        		keyboard.put(keymap[i].charAt(j), j+1);
		        	}else {
		        		int v = keyboard.get(keymap[i].charAt(j));
		        		int minvalue = (j+1 > v) ? v:j+1;
						keyboard.put(keymap[i].charAt(j), minvalue);
					}
	        	}
	        } // value에 작은 값들로 추가 완료
	        
	        // target
	        for(int i=0; i < targets.length; i++) {
	        	int sum = 0;
	        	for(int j = 0; j < targets[i].length(); j++) {
	        		if(keyboard.containsKey(targets[i].charAt(j))) {
	        			sum += keyboard.get(targets[i].charAt(j));
	        		}
	        		else {
	        			sum = -1;
	        			break;
	        		}
	        	}
	        	answer[i] = sum;
	        }
	        
	        return answer;
	    
    }
}
