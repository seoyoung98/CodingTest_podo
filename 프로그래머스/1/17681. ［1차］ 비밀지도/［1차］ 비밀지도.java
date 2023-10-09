class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr1_bin = new String[n];
        String[] arr2_bin = new String[n];
        // 2진법으로 바꾸기, 길이가 n이 안되면 0으로 채우기 
        for(int i = 0; i < n; i++) {
        	String bin1 = Integer.toBinaryString(arr1[i]);
        	String new_arr1 = "";
        	if(bin1.length() < n) {
        		for(int j = 0; j < n-bin1.length();j++) {
        			new_arr1 += "0";
        		}
        	}
        	arr1_bin[i] = new_arr1 + bin1;
        	
        }
        
        for(int i = 0; i < n; i++) {
        	String bin2 = Integer.toBinaryString(arr2[i]);
        	String new_arr2 = "";
        	if(bin2.length() < n) {
        		for(int j = 0; j < n-bin2.length();j++) {
        			new_arr2 += "0";
        		}
        	}
        	arr2_bin[i] = new_arr2 + bin2;
        }
        // 여기서부터 문제,, ㅜㅠ
        // replace
        for(int i = 0; i < n; i++) {
        	String word = "";
        	for(int j = 0; j < arr1_bin[i].length(); j++) {
        		if(arr1_bin[i].charAt(j) == '0' && arr2_bin[i].charAt(j) == '0') {
        			word += " ";
        		}
        		else if(arr1_bin[i].charAt(j) == '1' || arr2_bin[i].charAt(j) == '1') {
        			word += "#";
        		}
        	}
        	answer[i] = word;
        }
        
        
        return answer;
    }
}