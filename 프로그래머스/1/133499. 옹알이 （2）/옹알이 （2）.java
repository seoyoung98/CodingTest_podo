class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
		String[] words = {"aya", "ye", "woo", "ma"};

		for (int i = 0; i < babbling.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (babbling[i].contains(words[j]) && !babbling[i].contains(words[j] + words[j])) {
                    babbling[i] = babbling[i].replace(words[j], " ");
                    // replaceFirst를 사용하지 못하는 이유!!
                    // 예제 2번에서 yemawoo를 보세요
                    // words에서는 ma 보다 woo가 먼저 나오죠?
                    // 근데 replaceFirst를 사용하면 woo가 지워지지가 않습니다.
                    // 뒤에 위치하는 woo를 지우기 위해서는 그냥 replace를 써줘야 합니다!!!
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