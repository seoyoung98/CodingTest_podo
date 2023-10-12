import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
		int len = 0;
		int cnt = 0;
		int cnt2 = 0;
		Arrays.sort(numbers);
		len = numbers[numbers.length - 1] + numbers[numbers.length - 2] + 1;
		int[] n = new int[len];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				n[numbers[i] + numbers[j]]++;
			}
		}
		for (int i = 0; i < len; i++) {
			if (n[i] != 0) cnt++;
		}
		System.out.println(cnt);
		int[] a = new int[cnt];
		for (int i = 0; i < len; i++) {
			if (n[i] != 0) a[cnt2++] = i;
		}
        return a;
    }
}