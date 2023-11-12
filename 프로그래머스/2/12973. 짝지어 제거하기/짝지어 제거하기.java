import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            stack.add(s.charAt(i));
            int len = stack.size();
            if(stack.size() >= 2 && (stack.get(len-1) == stack.get(len-2))){
                stack.pop();
                stack.pop();
            }
        }
        if(stack.size() == 0) return 1;
        else return 0;
    }
}
