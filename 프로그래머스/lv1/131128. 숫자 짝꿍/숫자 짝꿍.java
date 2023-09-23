class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] x_lst = new int[10];
        int[] y_lst = new int[10];
        
        for(int i = 0; i < X.length(); i++){
            x_lst[(int)(X.charAt(i)-'0')]++;
        }
        for(int i = 0; i < Y.length(); i++){
            y_lst[(int)(Y.charAt(i)-'0')]++;
        }
        
        for(int i = 9; i >= 0; i--){
            int n = Math.min(x_lst[i],y_lst[i]);
            answer += Integer.toString(i).repeat(n);    
        }
        int n_0 = Math.min(x_lst[0],y_lst[0]);
        if (answer.length() == 0) return "-1";
        else if (answer.length() == n_0) return "0";
        else return answer;
    }
}