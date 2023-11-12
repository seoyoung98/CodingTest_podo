import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        LinkedList<Integer> de_people = new LinkedList<>();
        for(int p : people){
            de_people.add(p);
        }
        while(de_people.size() > 1){
            if(de_people.get(0) + de_people.get(de_people.size()-1) > limit){
                de_people.pollLast();
            }else{
                de_people.pop();
                de_people.pollLast();
            }
            answer++;
        }
        if(de_people.size() == 1) answer++;

        return answer;
    }
}