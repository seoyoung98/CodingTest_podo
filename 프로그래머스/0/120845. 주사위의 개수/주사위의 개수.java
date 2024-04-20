class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int width, length, height = 0;
        
        width = box[0] / n;
        length = box[1] / n;
        height = box[2] / n;
        
        answer = width * length * height;
        
        return answer;
    }
}