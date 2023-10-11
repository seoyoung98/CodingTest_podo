import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int l, int r) {
		ArrayList<Integer> list = new ArrayList<>();

		first: for (int i = l; i <= r; i++) {
			String num = "";
			if (i % 5 == 0) {
				num = Integer.toString(i);
				for (int j = 0; j < num.length(); j++) {
					if (num.charAt(j) != '0' && num.charAt(j) != '5') {
						continue first;
					}
				}
				list.add(i);
			}
		}
		if (list.isEmpty()) {
			list.add(-1);
		}

		return list;
    }
}