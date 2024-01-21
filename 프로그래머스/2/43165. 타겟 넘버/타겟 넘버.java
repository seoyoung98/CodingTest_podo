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
            System.out.println("으악");
            System.out.println("sumsum" + sum);
            if(sum == target) {
                System.out.println("성공");
                answer++;
            }
            return;
        }
        System.out.println("depth ===> " + depth);
        System.out.println("sum => " + sum);
        dfs(depth+1, sum + numbers[depth], numbers, target);
        System.out.println("오나");
        dfs(depth+1, sum - numbers[depth], numbers, target);
        System.out.println("last 팡");
    }
}
