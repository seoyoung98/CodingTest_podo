import java.util.*;
class Solution {
    // 많은 경우의 수를 생각해야 하고
    // 최대 던전의 수가 8개로 많지 않으므로
    // 모든 경우의 수를 다 돌 수 있는 깊이 우선 탐색 dfs를 사용한다.
    public int result = 0;
    public boolean[] visit; // 해당 노드에 도착을 했는지 체크를 해주어야 한다.
    // boolean의 default 값은 false이다.
    
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        fatigue(0,k,dungeons);
        return result;
    }
    
    public void fatigue(int depth, int k, int[][] dungeons){
        for(int i = 0; i < dungeons.length; i++){
            // 해당 노드를 거쳐가지 않고 최소 필요 피로도가 남은 피로도보다 작은 경우에만
            if(!visit[i] && dungeons[i][0] <= k){
                visit[i] = true; // 해당 노드는 거쳐갔다고 체크 하고
                // 그 다음 노드로 내려가고 가지고 있는 피로도를 깎아준다.
                //System.out.println(dungeons[i][0] + " : " + dungeons[i][1]);
                //System.out.println("k => " + k);
                //System.out.println("depth ==> " + depth);
                fatigue(depth + 1, k-dungeons[i][1], dungeons);
                visit[i] = false; // 그리고 다시 다음 체크를 위해 false로 바꿔준다.
            }
        }
        // result 값과 depth 깊이 중 큰 수를 return 한다.
        result = Math.max(result, depth);
    }
}