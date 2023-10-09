class Solution {
    public int[] solution(String s) {
        String[] s_array = s.split("");
        int[] answer = new int[s_array.length];
        answer[0] = -1;
        
        for(int i = 1; i < s_array.length; i++) {
        	for(int j = i-1; j > -1 ; j--) {
        		if(s_array[i].equals(s_array[j])) {
        			answer[i] = i-j;
        			break;
        		}
        	}
        }
        
        for(int i = 0; i < answer.length; i++) {
        	if(answer[i] == 0) {
        		answer[i] = -1;
        	}
        }
        
        return answer;
}
}