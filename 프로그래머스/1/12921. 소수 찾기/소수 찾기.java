import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
		
		// true 배열 만들기
		ArrayList<Boolean> arr = new ArrayList<>();
		
		// n까지 넣어주는 것이 제일 중요!!
		for(int i = 0; i <= n; i++) {
			arr.add(true);
		}
		// System.out.println(arr);
		
		for(int i = 2; i <= (int)Math.pow(n, 0.5); i++) {
			if(arr.get(i) == true) {
				int j = 2;
				while (i * j <= n){
					//배수가 있으면 소수가 아니므로 false로 바꿔준다.
					arr.set(i*j, false);
					j++;
				}
			}
		}
		for(int i = 2; i <= n; i++) {
			if(arr.get(i) == true) {
				answer++;
			}
		}
		return answer;
    }
}