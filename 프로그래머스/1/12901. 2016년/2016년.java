import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(1, 31);
        hs.put(2, 29);
        hs.put(3, 31);
        hs.put(4, 30);
        hs.put(5, 31);
        hs.put(6,30);
        hs.put(7,31);
        hs.put(8,31);
        hs.put(9,30);
        hs.put(10,31);
        hs.put(11,30);
        hs.put(12,31);
        int day_sum = 0;

        for(int i = 1; i < a; i++){
            day_sum += hs.get(i);
        }
        day_sum += b;

        int day = day_sum % 7;

        switch(day){
            case 0:
                answer += "THU";
                break;
            case 1:
                answer += "FRI";
                break;
            case 2:
                answer += "SAT";
                break;
            case 3:
                answer += "SUN";
                break;
            case 4:
                answer += "MON";
                break;
            case 5:
                answer += "TUE";
                break;
            case 6:
                answer += "WED";
                break;
        }
        return answer;
        }
    }
