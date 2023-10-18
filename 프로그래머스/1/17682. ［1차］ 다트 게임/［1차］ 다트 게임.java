class Solution {
    public int solution(String dartResult) {
        int answer = 0;
		int[] answer_list = new int[3]; // 여기에 3개의 점수들을 넣어 줄 것이다.
		int j = 0; 
		String num_string = "";

		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);

			// 숫자일 때
			if (Character.isDigit(c)) {
				num_string += String.valueOf(c);
			}
			// 문자일 때
			else if (c == 'S' || c == 'D' || c == 'T') {
				int num = Integer.parseInt(num_string);
				switch (c) {
				case 'S':
					answer_list[j] = num;
					break;
				case 'D':
					answer_list[j] = (int) Math.pow(num, 2);
					break;
				case 'T':
					answer_list[j] = (int) Math.pow(num, 3);
					break;
				}
				j++;
				num_string = "";
			}
			// 특수 문자
			else if (c == '*' || c == '#') {
				switch (c) {
				case '*':
					answer_list[j-1] *= 2;
					if(j-2>=0) answer_list[j-2]*=2;
					break;
				case '#':
					answer_list[j-1]*=(-1);
					break;
				}
			}
		}
		

		return answer_list[0]+answer_list[1]+answer_list[2];
    }
}