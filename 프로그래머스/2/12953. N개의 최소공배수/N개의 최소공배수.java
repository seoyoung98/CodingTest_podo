
class Solution {
    public static int lcm_2(int a, int b){
        int answer = 0;
        for(int i = Math.max(a,b); i <= a*b; i++){
            if(i % a == 0 && i % b == 0) {
                answer = i;break;
            }
        }
        return answer;
    }
    public int solution(int[] arr) {
        int answer = 1;
        int compare_num = 0;

        for(int i = 0; i < arr.length; i++){
            compare_num = lcm_2(answer,arr[i]);
            answer = compare_num;
        }

        return compare_num;
    }
}