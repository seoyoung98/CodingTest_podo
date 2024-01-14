import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String result = "";
        String[] numberString = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            numberString[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numberString, (a, b) -> (b + a).compareTo(a+ b));

        if(numberString[0].equals("0")) return "0";

        for(String s : numberString) {
            result += s;
        }

        return result;
    }
}