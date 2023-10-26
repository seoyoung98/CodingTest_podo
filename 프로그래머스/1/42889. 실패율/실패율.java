import java.util.*;
class Solution {
    // 찢었다!!
    public List<Integer> solution(int N, int[] stages) {
        int[] answer = {};
		int[] level_people = new int[N + 1];
		// System.out.println(Arrays.toString(level_people));
		for (int i = 0; i < stages.length; i++) {
			level_people[stages[i] - 1] += 1; // 해당하는 단계의 사람 세어주기
		}
		// System.out.println("level_people : "+Arrays.toString(level_people));
		HashMap<Integer, Double> score = new HashMap<>(); // key 기준으로 정렬 
		int people = 0;
		for (int i = 0; i < N; i++) {
			Double val = (double)level_people[i] / (stages.length - people);
			if((stages.length - people == 0) || level_people[i] == 0) {
				score.put(i+1, 0.0);
			}else {
			score.put(i + 1, val); // 추가
			}
			// System.out.println("level_[i] : "+level_people[i]);
			people += level_people[i];
			// System.out.println(stages.length - people);
		}
		//System.out.println("score : " + score);
		// 정렬 -> 람다 사용해서 인덱스 빼내기?
		List<Integer> keySet = new ArrayList<>(score.keySet());
		Collections.sort(keySet,(o1,o2) -> Double.compare(score.get(o2),score.get(o1)));
		//System.out.println("정렬 후 : " + keySet);

		return keySet;
    }
}