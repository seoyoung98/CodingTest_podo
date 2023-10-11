class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int remain = n % a;
            int quo = n / a;
            answer += quo * b;
            n = quo * b + remain;
        }
        
        return answer;
    }
}