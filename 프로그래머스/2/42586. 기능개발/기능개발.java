import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
		int[] day = new int[progresses.length];
		ArrayList<Integer> answer = new ArrayList<>();
		// 넣어서 
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < progresses.length; i++) {
			day[i] = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
		}
		
		// System.out.println(day[0]+":"+day[1]+":"+day[2]);
		// 7 : 3 : 9
		
		int a = day[0];
		stack.add(a);
		for (int i = 1; i < day.length; i++) {
			if (i == day.length-1) {
				if (day[i] > a) {
					answer.add(stack.size());
					answer.add(1);
				}else {
					answer.add(stack.size()+1);
				}

			} else if (day[i] <= a) {
				stack.add(day[i]);
			} else if (day[i] > a) {
				answer.add(stack.size());
				stack.clear();
				stack.add(day[i]);
				a = day[i]; // max 값 변경
			}
		}
		
		return answer;
	}
}