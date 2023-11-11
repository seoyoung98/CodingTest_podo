class Solution {
    public int[] solution(String s) {
       /*
        int count_step = 0;
        int count_zero = 0;

        while (!s.equals("1")){
            count_zero += s.length() - s.replace("1","").length();
            count_step++;
            s = Integer.toBinaryString(Integer.parseInt(s,2));
        }
        int[] answer = {count_step, count_zero};
        return answer;*/
        int count_step = 0;
        int count_zero = 0;

        while(true){
            if(s.equals("1")) break;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == "0".charAt(0)) count_zero++;
            }
            s = s.replace("0","");
            s = Integer.toBinaryString(s.length());
            count_step += 1;
        }
        int[] answer = {count_step, count_zero};
        return answer;
    }
}