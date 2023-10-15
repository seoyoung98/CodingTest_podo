import java.util.ArrayList;
import java.util.Collections;

class Solution {
    // 자바에서 중복 순열을 구현하는 방법
	/*
	 * arr => 돌릴 배열 out => 출력 없어도 됨 depth
	 */
	public static ArrayList<String> permutation(String[] arr, String[] out, int depth, int r) {
//		ArrayList<String> word_List = new ArrayList<>();
//		if (depth == r) {
//			for (String word : out) {
//				word_List.add(word);
//			}
//			return word_List;
//		}
//		else {
//		for (int i = 0; i < arr.length; i++) {
//			out[depth] = arr[i];
//			permutation(arr, out, depth + 1, r);
//			
//		}
//		}
		ArrayList<String> word_List = new ArrayList<>();

	    if (depth == r) {
	        // Create a permutation and add it to the list
	        StringBuilder permutation = new StringBuilder();
	        for (int i = 0; i < r; i++) {
	            permutation.append(out[i]);
	            if (i < r - 1) {
	                permutation.append("");
	            }
	        }
	        word_List.add(permutation.toString());
	    } else {
	        for (int i = 0; i < arr.length; i++) {
	            out[depth] = arr[i];
	            word_List.addAll(permutation(arr, out, depth + 1, r));
	        }
	    }

	    return word_List;
	}

//	public static void main(String[] args) {
//		String[] arr = {"A","E","I","O","U"};
//		int r = 2;
//		permutation(arr, new String[r], 0, r);
//	}
//	
	public static int solution(String word) {

		String[] word_list = { "A", "E", "I", "O", "U" };

		ArrayList<String> real_List = new ArrayList<>();

		// 1글자
		for (String w : word_list) {
			real_List.add(w);
		}

		// 2 글자
		for (String w : permutation(word_list, new String[2], 0, 2)) {
			real_List.add(w);
		}

		// 3 글자
		for (String w : permutation(word_list, new String[3], 0, 3)) {
			real_List.add(w);
		}

		// 4 글자
		for (String w : permutation(word_list, new String[4], 0, 4)) {
			real_List.add(w);
		}

		// 5 글자
		for (String w : permutation(word_list, new String[5], 0, 5)) {
			real_List.add(w);
		}

		Collections.sort(real_List);

		return real_List.indexOf(word)+1;
}}