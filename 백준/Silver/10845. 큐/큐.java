import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> q = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			// 윤성이의 stack 틀을 참조했습니당
			if (word.contains("push")) {
				String[] word_arr = word.split(" ");
				q.offerFirst(Integer.parseInt(word_arr[1]));
			} else {
				switch (word) {
				// 가장 앞 정수 반환
				case "pop":
					if (q.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(q.pollLast());
					}
					break;
				// 크기
				case "size":
					System.out.println(q.size());
					break;
				// 비었는지 확인
				case "empty":
					if (q.isEmpty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
				// 제일 앞 정수 출력
				// 삽입이 되는 쪽이 front : 제일 마지막에 들어간 것
				case "front":
					if (q.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(q.peekLast());
					}
					break;
				// 가장 뒤 있는 정수 출력
				// 삭제가 되는 쪽이 back : 제일 처음 들어간 것
				case "back":
					if (q.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(q.peekFirst());
					}
					break;
				default:
					break;
				}

			}
		}
	}
}