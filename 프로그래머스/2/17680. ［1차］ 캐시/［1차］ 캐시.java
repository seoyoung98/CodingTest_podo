import java.util.*;
/*
 * 지도에서 도시 이름을 검색하면 관련 맛집을 보여줌
 * 서비스 오픈 전 각 로직에 대한 성능 측정
 * DB 캐시를 적용할 때 캐시 크기에 따른 실행 시간 측정 프로그램 작성
 * 
 * cacheSize -> 캐시 크기
 * cities -> 도시 이름 배열
 * 
 * 입력된 배열을 순서대로 처리할 시 총 실행시간 출력
 * 
 * 캐시 크기만큼만 유지되도록
 * 미쳤다!! 찢었다!
 */
/*
 * LRU(Least Recently Used) 알고리즘
 * 맨 앞이 가장 최근에 쓰인 작업
 * 맨 뒤는 가장 오랫동안 쓰이지 않은 작업
 * cache miss -> 해야 할 작업이 없는 상태 5초
 * cache hit -> 해야 할 작업이 있는 상태 1초
 */
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
