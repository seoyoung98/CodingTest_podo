class Solution {
    // n에 3이 포함되어 있는지 확인
	public boolean find3(int n) {
		String nString = Integer.toString(n);
		
		for(int i = 0; i < nString.length(); i++) {
			if(nString.charAt(i) == '3') {
				return false; // 3이 포함되었으면 false
			}
		}
		return true; // 포함되지 않았으면 true
	}
    
    public int solution(int n) {
        int answer = 0; // 계속해서 올라가는 수 
		// int count = 0; // 개수
		/*
		while(true) {
			if(count == n) break;
			if(answer % 3 != 0 && find3(answer) == true) {
				count++;
				answer++;
			}else {
				answer++;
			}
		}*/
		
		for(int i = 0; i < n; i++) {
			answer++;
			while(answer % 3 == 0 || find3(answer) == false) {
				answer++;
			}
		}
		
		return answer;
    }
}