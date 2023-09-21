class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
		int max = 0;
        
		for(int i= 0; i < 6; i++) {
			if(lottos[i] > max) {
				max = lottos[i]; // 최대값 찾기
			}
		}
		if(max == 0) { // 모두 0일 때
			int[] ans_0 = {1,6};
			return ans_0;
		}else { // 아닐 때
			int count = 0; // 일치하는 개수
			int count_0 = 0; // 0의 개수
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 6; j++) {
					if(lottos[i] == win_nums[j]) {
						count++;
					}
				}
				if(lottos[i] == 0) {
					count_0++;
				}
			}
			int max_num = count + count_0;
			answer[0] = rank(max_num);
			answer[1] = rank(count);
			return answer;
		}
    }
    public static int rank(int n) {
		if(n>=6) {
			n = 6;
		}
		switch (n) {
		case 6:
			return 1; 
		case 5:
			return 2; 
		case 4:
			return 3; 
		case 3:
			return 4; 
		case 2:
			return 5; 
		default:
			return 6;
		}
	}
}