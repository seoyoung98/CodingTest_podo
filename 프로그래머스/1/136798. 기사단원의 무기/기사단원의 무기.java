import java.util.*;
class Solution {
	// 약수의 개수 구하
    public int count_num(int n) {
		int count = 0;
		for(int i = 1; i <= Math.pow(n, 0.5); i++) {
			if(n % i == 0) {
				count += 2; // 절반까지만 돌릴꺼니께 2개씩 올리기
			}
		} 
	    // 만약! 1로 나누어 떨어진다는 의미는 정수라는 의미!
	    // n의 제곱근이니까 1개만 세어줘야 한다
	    // 위에서 2개나 + 해줬으니까 1개 빼주기!
		if(Math.pow(n, 0.5) % 1 == 0) {
			count--;
		}
		return count;
	}
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
		ArrayList<Integer> num_list = new ArrayList<>();
		
		for(int i = 1; i <= number; i++) {
			if(count_num(i) > limit) { // 제한 수치를 넘겼다면
				num_list.add(power); // power가 공격력
			}
			else { // 제한 수치를 넘기지 않았다면
				num_list.add(count_num(i)); // 약수의 개수가 공격력
			}
		}
		// 다 더해주기~~
		for(int n : num_list) {
			answer += n;
		}
		
		return answer;
    }
}
