class Solution {
    public String solution(String s) {
         String answer = "";
        String[] s_list = s.split(" ");
      
        int min_n = Integer.parseInt(s_list[0]);
        int max_n = Integer.parseInt(s_list[0]);
        for(String sNum : s_list){
            int sN = Integer.parseInt(sNum);
            if(sN < min_n) min_n = sN;
            if(sN > max_n) max_n = sN;
        }
        answer = min_n + " " + max_n;


        return answer;
    }
}
