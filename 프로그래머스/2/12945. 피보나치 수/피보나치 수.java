import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> fi_list = new ArrayList<>();
        fi_list.add(0);
        fi_list.add(1);

        for(int i = 2; i <= n; i++){
            fi_list.add((fi_list.get(i-2)+fi_list.get(i-1))%1234567);
        }
        return fi_list.get(n);
    }
}