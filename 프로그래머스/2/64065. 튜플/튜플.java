import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String s) {
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