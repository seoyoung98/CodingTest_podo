class Solution {
	    public int solution(String s) {
	        int answer = 0; // 결과
	        int sum_v = 0; // 빠진 길이 수
	        int x_count = 0; // 기준이 되는 알파벳 수
	        int else_count = 0; // 기준이 되는 알파벳이 아닌 수
	        int a = 0; // 기준이 되어줄 알파벳의 새로운 인덱스
	        
	        String[] s_arr = s.split(""); // s 나눠서 String 배열에 삽입
	        String x = s_arr[a]; // 기준이 되는 알파벳
	        for(String en : s_arr){
	            if((x_count > 0 && else_count > 0) && (x_count == else_count)){
	                answer++; // 결과 플러스
	                sum_v += (x_count + else_count); // 빠진 길이 추가 
	                x_count = 0; // 다시 0으로 초기화
	                else_count = 0; // 다시 0으로 초기화 
	                if(a < s_arr.length - 1){
	                    x = s_arr[a+1];
	                }else{
	                    break;
	                }
	            }
	            if(en.equals(x)){x_count++;}
	            else{else_count++;}
	            a++;
	        }
	        if(sum_v == s_arr.length){return answer;}
	        else{return answer+1;}
	    }
	}