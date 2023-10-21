import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
		// hashset은 중복 없음!
		LinkedList<String> queue = new LinkedList<>();

		for (String c : cities) {
			String us = c.toUpperCase();
			if (cacheSize == 0) {
				return cities.length * 5;
			} 
			// 캐시가 여유로울 때
			else if (cacheSize >= cities.length) {
				if (queue.contains(us))
					answer += 1;
				else
					answer += 5;
				queue.add(us);
			} else {
				if (queue.size() < cacheSize) {
					if (queue.contains(us)) {
						answer += 1;
						queue.remove(us);
					} else {
						answer += 5;
					}
					queue.addLast(us);
				} else {
					if (queue.contains(us)) {
						queue.remove(us);
						queue.addLast(us);
						answer += 1;
					} else {
						queue.pollFirst();
						queue.addLast(us);
						answer += 5;
					}
				}
			}
		}

		// System.out.println(hs.size());

		return answer;
    }
}