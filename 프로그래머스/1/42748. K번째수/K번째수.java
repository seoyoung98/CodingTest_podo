import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			ArrayList<Integer> new_List = new ArrayList<>();
			for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++) {
				new_List.add(array[j]);
			}
			Collections.sort(new_List);
			answer[i] = new_List.get(commands[i][2]-1);
		}
		
		return answer;
    }
}