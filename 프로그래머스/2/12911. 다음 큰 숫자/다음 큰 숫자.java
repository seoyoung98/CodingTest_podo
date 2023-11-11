class Solution {
    public int solution(int n) {
        int answer = 0; // 정답 저장
        String bin_n = Integer.toBinaryString(n); // 일단 stringbinary로 바꿈
        int count_n = 0; // n의 1의 개수 저장
        for(int i = 0; i < bin_n.length(); i++){
            if(bin_n.charAt(i) == "1".charAt(0)) count_n++;
        }

        // 다음 큰 수 찾아내기
        for (int i = n+1; i < 1000000; i++){
            String next_big = Integer.toBinaryString(i); // stringbinary로 만들어주기
            int count_next = 0; // 그 수의 1의 개수 세기
            for(int j = 0; j < next_big.length(); j++){
                if(next_big.charAt(j) == "1".charAt(0)) count_next++;
            }
            if(count_next == count_n) {
                answer = i; break;
            }
        }
        return answer;
    }
}