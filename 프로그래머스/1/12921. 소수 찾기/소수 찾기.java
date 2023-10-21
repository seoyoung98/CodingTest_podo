import java.util.*;
/*
=> 에라토스테네스의 체 - 대량의 소수를 한 번에 판별하는 데 사용
1. 배열 생성, True로 값 초기화
2. 2부터 시작해서 특정 숫자의 배수에 해당하는 숫자 지우기(특정 숫자는 지우지 말기)
3. 이미 지워진 숫자의 경우는 건너뛰기 (True인 경우만 실행)
4. 2부터 남아있는 숫자를 출력
 */
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
