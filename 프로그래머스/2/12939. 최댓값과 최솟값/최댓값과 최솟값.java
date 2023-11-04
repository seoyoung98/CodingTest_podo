import java.util.Arrays;
class Solution {
    public String solution(String s) {
         String answer = "";
        String[] s_list = s.split(" ");
        int s_len = s_list.length;
        int[] new_num = new int[s_len];
        for(int i = 0; i < s_len; i++){
            new_num[i] = Integer.parseInt(s_list[i]);
        }
        
        Arrays.sort(new_num);
        
        int min_n = new_num[0];
        int max_n = new_num[s_len-1];
        
        answer = min_n + " " + max_n;


        return answer;
    }
}