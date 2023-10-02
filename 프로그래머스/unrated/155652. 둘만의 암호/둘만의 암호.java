import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
		
		List<String> english = new ArrayList<>();
		for (char i = 'a'; i <= 'z'; i++) {
			english.add(String.valueOf(i));
		}
	        // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		
		String[] s_list = s.split("");
		String[] skip_list = skip.split("");
		
		
		int minus_length = english.size() - skip.length();
		
		// skip 지우기 
		for (int i = 0; i < skip_list.length; i++) {
			int idx = english.indexOf(skip_list[i]); // skip와 일치하는 문자의 인덱스를 찾아서 
			english.remove(idx);
		}
		
		for (int i = 0; i < s_list.length; i++) {
			int idx = english.indexOf(s_list[i]);
			answer += english.get((idx + index)%minus_length);
		}
		
		return answer;
    }
}
