import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String solution(int[] food) {
        String answer = "";

		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> right = new ArrayList<>();

		for (int i = 1; i < food.length; i++) {
			for (int j = 0; j < food[i] / 2; j++) {
				left.add(i);
				right.add(i);
			}
		}

		left.add(0);

		Collections.reverse(right);

		for (int i = 0; i < left.size(); i++) {
			answer += Integer.toString(left.get(i));
		}
		for (int i = 0; i < right.size(); i++) {
			answer += Integer.toString(right.get(i));
		}

		return answer;
    }
}