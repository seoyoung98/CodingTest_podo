import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		Stack<Character> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // 2를 입력 받음
		for (int i = 0; i < num; i++) {
			String str = br.readLine();
			String[] str_word = str.split(" ");
			StringBuilder result = new StringBuilder();
			for (String word : str_word) {
				for (int j = 0; j < word.length(); j++) {
					stack.push(word.charAt(j)); // 단어 하나씩 stack에 넣기
				}
				while(!stack.isEmpty()) {
					result.append(stack.peek()); // 제일 위에꺼 string builder에 추가
					stack.pop();
				}
				result.append(" ");
			}
			System.out.println(result);
		}
	}
}