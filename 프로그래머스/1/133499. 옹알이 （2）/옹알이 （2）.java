class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
		String[] words = {"aya", "ye", "woo", "ma"};

		for (int i = 0; i < babbling.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (babbling[i].contains(words[j]) && !babbling[i].contains(words[j] + words[j])) {
                    babbling[i] = babbling[i].replace(words[j], " ");
                }
			}
			babbling[i] = babbling[i].replace(" ", "");
			if(babbling[i] == "") {
				answer++;
			}
		}

		return answer;
    }
}