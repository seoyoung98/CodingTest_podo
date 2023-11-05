
// 쌍만 맞으면 되는게 아니라 순서도 맞아야 함
// 효율성 망 
class Solution {
    boolean solution(String s) {
        /*
       Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.size() == 0 && s.charAt(i) == ')'){
                return false;
            }
            stack.add(s.charAt(i));
            if (stack.size() >= 2 && stack.subList(stack.size() - 2, stack.size()).equals(Arrays.asList('(', ')'))) {
                stack.pop();
                stack.pop();
            }
        }
        if(stack.isEmpty()) return true;
        else return false;*/
        
         int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                cnt++;
            }else if(c == ')'){
                if(cnt <= 0){
                    return false;
                }
                cnt--;
            }
        }
        return cnt==0?true:false;
    }
}