
import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= yellow; i++) {
			if ((yellow % i == 0) && (brown == ((i + 2) * 2 + ((yellow / i + 2) * 2) - 4))) {
				list.add(i + 2);
				list.add(yellow / i + 2);
				break;
			}
		}
		int max_num = list.get(0);
		int min_num = list.get(0);
		
		for(int i = 0; i <list.size(); i++) {
			if(max_num <= list.get(i)) max_num = list.get(i);
			if(min_num >= list.get(i)) min_num = list.get(i);
		}
		int[] answer = {max_num,min_num};
        return answer;
    }
}