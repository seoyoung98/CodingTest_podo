import java.util.*;
class Solution {
    public int count_num(int n) {
		int count = 0;
		for(int i = 1; i <= Math.pow(n, 0.5); i++) {
			if(n % i == 0) {
				count += 2;
			}
		}
		if(Math.pow(n, 0.5) % 1 == 0) {
			count--;
		}
		return count;
	}
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
		ArrayList<Integer> num_list = new ArrayList<>();
		
		for(int i = 1; i <= number; i++) {
			if(count_num(i) > limit) {
				num_list.add(power);
			}
			else {
				num_list.add(count_num(i));
			}
		}
		
		for(int n : num_list) {
			answer += n;
		}
		
		return answer;
    }
}