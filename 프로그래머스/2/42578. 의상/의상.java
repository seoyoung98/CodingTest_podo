import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

		HashMap<String, Integer> hs = new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			if (hs.containsKey(clothes[i][1])) {
				hs.put(clothes[i][1], hs.get(clothes[i][1]) + 1);
			} else {
				hs.put(clothes[i][1], 1);
			}
		}
		//System.out.println(hs);
		// hs에 종류별로 저장 완료!

		// 종류 개수
		int clothes_sort = hs.size();

		// hs 안에서 돌면서 확인
		for (String key:hs.keySet()) {
			answer *= (hs.get(key) + 1);
		}
		answer--;

		return answer;
    }
}