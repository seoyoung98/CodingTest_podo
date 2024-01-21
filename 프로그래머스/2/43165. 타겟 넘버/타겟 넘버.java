class Solution {
    int answer;
    // 모든 경우의 수를 다 돈다.!!
    public int solution(int[] numbers, int target){
        answer = 0;
        dfs(0,0,numbers,target);
        return answer;
    }

    public void dfs(int depth, int sum, int[] numbers, int target){
        if(depth == numbers.length){
            if(sum == target) answer++;
            return;
        }
        //System.out.println("depth ===> " + depth);
        //System.out.println("n last + " + depth);
        //System.out.println("sum => " + sum);
        dfs(depth+1, sum + numbers[depth], numbers, target);
        dfs(depth+1, sum - numbers[depth], numbers, target);
    }
}
