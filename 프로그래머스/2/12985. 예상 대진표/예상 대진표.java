import java.util.Arrays;
class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int[] num = {a, b};
        Arrays.sort(num);

        int small = num[0];
        int big = num[1];

        while(!(small % 2 == 1 && big % 2 == 0 && small+1 == big)){
            if(small % 2 == 0) small = small / 2;
            else small = small / 2 + 1;
            if(big % 2 == 0) big = big / 2;
            else big = big / 2 + 1;
            answer++;
        }
        return answer+1;
    }
}