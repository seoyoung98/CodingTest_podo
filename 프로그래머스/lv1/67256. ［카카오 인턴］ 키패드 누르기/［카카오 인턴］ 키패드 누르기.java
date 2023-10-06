import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] left_hand = {1,4,7}; // 왼손이 닿는 곳
        int[] right_hand = {3,6,9}; // 오른손이 닿는 곳
        int[] left = new int[] {3,0}; // 왼손 시작
        int[] right = new int[] {3,2}; // 오른손 시작
//        
//        ArrayList<Integer> l_List = new ArrayList<>();
//        ArrayList<Integer> r_List = new ArrayList<>();
        
        int length_left = 0;
		int length_right = 0;
        
        for(int i = 0; i < numbers.length; i++) {
//        	if(Arrays.asList(left_hand).contains(numbers[i])) {
//        		l_List.add(numbers[i]);
        	if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        		answer += 'L';
        		if(numbers[i] == 1) {
        			left[0] = 0;
        			left[1] = 0;
        		}
        		else if(numbers[i] == 4) {
        			left[0] = 1;
        			left[1] = 0;
        		}else if(numbers[i] == 7) {
        			left[0] = 2;
        			left[1] = 0;
        		}
        	}
//        	else if(Arrays.asList(right_hand).contains(numbers[i])) {
//        		r_List.add(numbers[i]);
        	else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
        		answer += 'R';
        		if(numbers[i] == 3) {
        			right[0] = 0;
        			right[1] = 2;
        		}
        		else if(numbers[i] == 6) {
        			right[0] = 1;
        			right[1] = 2;
        		}else if(numbers[i] == 9) {
        			right[0] = 2;
        			right[1] = 2;
        		}
        	}
        	else {
        		if(numbers[i] == 2) {
        			length_left = Math.abs(left[0]-0) + Math.abs(left[1]-1);
        			length_right = Math.abs(right[0]-0) + Math.abs(right[1]-1);
        			
        			if(length_left < length_right) {
//        				l_List.add(numbers[i]);
                		answer += 'L';
                		left[0] = 0;
                		left[1] = 1;
        			}
        			else if(length_left > length_right) {
//        				r_List.add(numbers[i]);
                		answer += 'R';
                		right[0] = 0;
                		right[1] = 1;
        			}
        			else {
        				if(hand.equals("left")) {
//        					l_List.add(numbers[i]);
                    		answer += 'L';
                    		left[0] = 0;
                    		left[1] = 1;
        				}
        				else if(hand.equals("right")){
//        					r_List.add(numbers[i]);
                    		answer += 'R';
                    		right[0] = 0;
                    		right[1] = 1;
        				}
        			}
            			
        		}
        		else if(numbers[i] == 5) {
        			length_left = Math.abs(left[0]-1) + Math.abs(left[1]-1);
        			length_right = Math.abs(right[0]-1) + Math.abs(right[1]-1);
        			
        			if(length_left < length_right) {
//        				l_List.add(numbers[i]);
                		answer += 'L';
                		left[0] = 1;
                		left[1] = 1;
        			}
        			else if(length_left > length_right) {
//        				r_List.add(numbers[i]);
                		answer += 'R';
                		right[0] = 1;
                		right[1] = 1;
        			}
        			else {
        				if(hand.equals("left")) {
//        					l_List.add(numbers[i]);
                    		answer += 'L';
                    		left[0] = 1;
                    		left[1] = 1;
        				}
        				else if(hand.equals("right")) {
//        					r_List.add(numbers[i]);
                    		answer += 'R';
                    		right[0] = 1;
                    		right[1] = 1;
        				}
        			}
        		}
        		else if(numbers[i] == 8) {
        			length_left = Math.abs(left[0]-2) + Math.abs(left[1]-1);
        			length_right = Math.abs(right[0]-2) + Math.abs(right[1]-1);
        			
        			if(length_left < length_right) {
//        				l_List.add(numbers[i]);
                		answer += 'L';
                		left[0] = 2;
                		left[1] = 1;
        			}
        			else if(length_left > length_right) {
//        				r_List.add(numbers[i]);
                		answer += 'R';
                		right[0] = 2;
                		right[1] = 1;
        			}
        			else {
        				if(hand.equals("left")) {
//        					l_List.add(numbers[i]);
                    		answer += 'L';
                    		left[0] = 2;
                    		left[1] = 1;
        				}
        				else if(hand.equals("right")) {
//        					r_List.add(numbers[i]);
                    		answer += 'R';
                    		right[0] = 2;
                    		right[1] = 1;
        				}
        			}
        		}
        		else if(numbers[i] == 0) {
        			length_left = Math.abs(left[0]-3) + Math.abs(left[1]-1);
        			length_right = Math.abs(right[0]-3) + Math.abs(right[1]-1);
        			
        			if(length_left < length_right) {
//        				l_List.add(numbers[i]);
                		answer += 'L';
                		left[0] = 3;
                		left[1] = 1;
        			}
        			else if(length_left > length_right) {
//        				r_List.add(numbers[i]);
                		answer += 'R';
                		right[0] = 3;
                		right[1] = 1;
        			}
        			else {
        				if(hand.equals("left")) {
//        					l_List.add(numbers[i]);
                    		answer += 'L';
                    		left[0] = 3;
                    		left[1] = 1;
        				}
        				else if(hand.equals("right")) {
//        					r_List.add(numbers[i]);
                    		answer += 'R';
                    		right[0] = 3;
                    		right[1] = 1;
        				}
        			}
        		}
        	}
        }
        
        return answer;
    }
}