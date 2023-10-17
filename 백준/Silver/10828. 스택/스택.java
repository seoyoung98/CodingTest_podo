import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			String[] word_arr = word.split(" ");
			// push => 값 집어넣기
			if (word_arr[0].equals("push")) {
				stack.push(Integer.parseInt(word_arr[1]));
			}
			// top => peek => 제일 꼭대기 확인만하기
			else if (word.equals("top")) {
				if (stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
			}
			// size => 크기 가져오기
			else if (word.equals("size")) {
				System.out.println(stack.size());
			}
			// empty => 비어있는지 확인
			else if (word.equals("empty")) {
				if (stack.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
			// pop =>
			else if (word.equals("pop")) {
				if (stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
			}
		}

	}
}
