class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

		String[] do_babbling = { "aya", "ye", "woo", "ma" };

		for (int i = 0; i < babbling.length; i++) {
			for (int j = 0; j < do_babbling.length; j++) {
				babbling[i] = babbling[i].replace(do_babbling[j], "0");
				
			}
			babbling[i] = babbling[i].replace("0", "");
			if(babbling[i].equals("")) answer++;
		}

		return answer;
    }
}