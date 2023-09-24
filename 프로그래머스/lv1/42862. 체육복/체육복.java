import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        // 리스트로 만들기 
        List<Integer> list_lost = new ArrayList<>();
        for(int num : lost){
            list_lost.add(num);
        }
        List<Integer> list_reserve = new ArrayList<>();
        for(int num : reserve){
            list_reserve.add(num);
        }
        Collections.sort(list_lost);
        Collections.sort(list_reserve);
        
        List<Integer> diff_lost = new ArrayList<>();
        List<Integer> diff_reserve = new ArrayList<>();
        
        // 중복 제거하기
        diff_lost = list_lost.removeAll(list_reserve);
        diff_reserve = list_reserve.removeAll(list_lost);
        
        for(int num : diff_lost){
            if(diff_lost.size() == 0) break;
            
            if(diff_reserve.contains(num - 1)){
                diff_reserve.remove(diff_reserve.indexOf(num - 1));
            }
            else if (diff_reserve.contains(num + 1)){
                diff_reserve.remove(diff_reserve.indexOf(num + 1));
            }
            else 
            {answer--;}
        }
        return answer;
    }
}