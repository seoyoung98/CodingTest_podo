import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int pick_mon = nums.length / 2;
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
        	hs.add(nums[i]);
        }
        
        return Math.min(pick_mon, hs.size());
    }
}