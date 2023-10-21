import java.util.*;

class Solution {
    public static int calculateTime(String time) {
		String[] strings = time.split(":");
		// 시간을 분으로 만들고
		int hour = Integer.parseInt(strings[0]) * 60;
		int minute = Integer.parseInt(strings[1]);
		return hour + minute;
	}
    
    public ArrayList<Integer> solution(int[] fees, String[] records) {
        int stand_time = fees[0];
		int stand_fee = fees[1];
		int unit_time = fees[2];
		int unit_fee = fees[3];
        ArrayList<Integer> answer = new ArrayList<>();
		// 차량 번호, 이용 시간
		HashMap<String, Integer> time_cal = new HashMap<>();
		// 등록 후 차 번호를 기준으로 정렬 해서 요금만 빼내기
		// 차량 번호, 일단 시간 등록
		HashMap<String, Integer> hs = new HashMap<>();

		for (int i = 0; i < records.length; i++) {
			String[] s = records[i].split(" ");
			int time = calculateTime(s[0]);
			String car = s[1];
			String in_out = s[2];

			if (in_out.equals("IN")) {
				time_cal.put(car, time); // 일단 in 한 차 등록
			} else if (in_out.equals("OUT")) { // out 이면 계산
				int in_car_time = time_cal.get(car); // 해당 차 번호의 입차 시간
				time_cal.remove(car); // 삭제
				int total_time = time - in_car_time; // 주차 한 시간
				if (hs.containsKey(car)) {
					int prev_time = hs.get(car);
					hs.remove(car);
					hs.put(car, total_time + prev_time);
				} else {
					hs.put(car, total_time); // 차량 등록
				}
			}

		}

		int last_time = calculateTime("23:59");
		if (time_cal.size() >= 1) {
			// key 값 가져와서 돌리자ㅏ
			for (String key : time_cal.keySet()) {
				int in_car_time = time_cal.get(key);
				int total_time = last_time - in_car_time;
				if (hs.containsKey(key)) {
					int prev_time = hs.get(key);
					hs.remove(key);
					hs.put(key, total_time + prev_time);
				} else {
					hs.put(key, total_time); // 차량 등록
				}
			}
		}
		 System.out.println(hs);
		
		// 계산 결과 등록
		TreeMap<String, Integer> result = new TreeMap<>();
		// 요금 계산 가즈아
		for (String key : hs.keySet()) {
			if(hs.get(key) > stand_time) {
				int fee = (int) (stand_fee + (Math.ceil(Math.ceil(hs.get(key)-stand_time)/unit_time)*unit_fee));
				result.put(key, fee);
			}
			else {
				result.put(key, stand_fee);
			}
		}
		 System.out.println(result);
		for(String key:result.keySet()) {
			answer.add(result.get(key));
		}
		
		return answer;
    }
}