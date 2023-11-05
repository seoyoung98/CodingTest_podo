class Solution {
    public int solution(int n) {
        int result = 1;

        for(int i = 1; i <= n/2; i++ ){
            int sum = 0;
            int idx = i;
            while(sum < n){
                sum += idx;
                if(sum == n){
                    result++; break;
                }
                idx++;
            }
        }

        return result;
    }
}