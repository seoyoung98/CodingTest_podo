import java.util.*;
import java.io.*;

class Solution {
    public int solution(int hp) throws IOException{
        int cnt = 0;
        // 장군개미 5, 병정개미 3, 일개미 1
        cnt += (hp / 5);
        hp %= 5;
        
        cnt += (hp / 3);
        hp %= 3;
        
        cnt += (hp / 1);
        
        return cnt;
    }
}