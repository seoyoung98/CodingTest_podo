import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n, String[] words) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<String> speak_list = new ArrayList<>();
        speak_list.add(words[0]);
        for(int i = 1; i < words.length; i++){
            int student = (i % n) + 1;
            int test = i / n + 1;
            if(speak_list.contains(words[i])){
                answer.add(student);
                answer.add(test);
                break;
            }
            else {
                speak_list.add(words[i]);
                if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                    answer.add(student);
                    answer.add(test);
                    break;
                }
            }
        }
        if(answer.size() == 0) {
            answer.add(0); answer.add(0);
        }
        return answer;
    }
}