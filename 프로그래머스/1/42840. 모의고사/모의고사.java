import java.util.*;
class Solution {
    // 리턴 타입 꼭 맞춰주셔요 런타임 에러,,나용,,
    public ArrayList<Integer> solution(int[] answers) {
        // 쉣,, 자바 왜 배열 곱하기 안되녀,,ㅠㅠ
		ArrayList<Integer> answer = new ArrayList<>();
        
		int[] student1 = { 1, 2, 3, 4, 5 }; // 5개
		int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5 }; // 8개
		int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }; // 10개

		int[] students = { 0, 0, 0 };

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student1[i % 5]) {
				students[0]++;
			}if (answers[i] == student2[i % 8]) {
				students[1]++;
			}if (answers[i] == student3[i % 10]) {
				students[2]++;
			}
		}
		// System.out.println(Arrays.toString(students));
		// 최고 개수
		int maxTest = Math.max(students[0], Math.max(students[1], students[2]));
		//System.out.println(maxTest);
		for (int i = 0; i < 3; i++) {
			if (students[i] == maxTest) {
				answer.add(i + 1);
			}
		}
		// 0빼기
		answer.remove(Integer.valueOf(0));

		return answer;
    }
}