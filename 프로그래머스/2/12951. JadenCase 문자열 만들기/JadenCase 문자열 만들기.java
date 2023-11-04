class Solution {
    public String solution(String s) {
      String answer = "";
        String[] s_list = s.split(""); // 공백도 다 들어가게 만들어줌
        int idx = 0;
        for(int i = 0; i < s_list.length; i++){
            if(s_list[i].equals(" ")) {
                answer += " "; idx = 0;
            }
            else if(idx == 0 && Character.isAlphabetic(s_list[i].charAt(0))) {
                answer += s_list[i].toUpperCase(); idx++;
            }
            else{
                answer += s_list[i].toLowerCase(); idx++;
            }
        }

        return answer;
    }
}