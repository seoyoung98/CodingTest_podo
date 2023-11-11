import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String s) {
        // s를 2차원 배열로 만들어서 각 원소들 중 가장 긴 것을 리턴하면 되는거 아니뇨,,
        // 아니였군,,
        // 질문하기 도움 많이많이 받아ㅡㅁ,,
       String[] s_list = s.split("\\},\\{");
        s_list[0] = s_list[0].replaceAll("\\{","");
        s_list[s_list.length-1] = s_list[s_list.length-1].replaceAll("\\}","");

        String[][] sort_list = new String[s_list.length][];
        for(int i = 0; i < s_list.length; i++){
            String[] set_list = s_list[i].split(",");
            sort_list[set_list.length - 1] = set_list; // split 한 결과를 넣어주기
        }

        ArrayList<Integer> answer_set = new ArrayList<>();
        for(int i = 0; i < sort_list.length; i++){
            for(int j = 0; j < sort_list[i].length; j++){
                if(!answer_set.contains(Integer.parseInt(sort_list[i][j]))){
                    answer_set.add(Integer.parseInt(sort_list[i][j]));
                }
            }
        }

        return answer_set;
    }
}