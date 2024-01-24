import java.util.*;

class Solution {
    public boolean[] visited;
    public Queue<Integer> queue = new LinkedList<>();
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                answer++;
                bfs(i, computers, n);
            }

        }
        return answer;
    }
    public void bfs(int idx, int[][] computers, int n){
        queue.offer(idx);
        visited[idx] = true;
        while(!queue.isEmpty()){
            int value = queue.poll();
            for(int j = 0; j < n; j++){
                if(!visited[j] && computers[value][j] == 1){
                    visited[j] = true;
                    bfs(j, computers, n);
                }
            }
        }

    }
    
}