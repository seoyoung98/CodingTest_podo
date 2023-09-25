import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
	String answer = "";
	    
        Arrays.sort(participant);
	Arrays.sort(completion);
        // 두 리스트를 비교하는데 리스트의 길이가 다르다면 작은 길이를 기준으로 비교한다.
	    for(int i = 0; i < completion.length; i++){ 
            if(!participant[i].equals(completion[i])) {
                answer += participant[i];
                break;  
            }
        }
        if(answer.length() == 0){
            return participant[participant.length - 1];
        }
        else{
            return answer;
        }
    }
}
