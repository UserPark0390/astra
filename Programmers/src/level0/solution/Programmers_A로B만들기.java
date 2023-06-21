package level0.solution;

import java.util.ArrayList;
import java.util.List;

public class Programmers_A로B만들기 {
	public static void main(String[] args) {
		String before = "allpe";
		String after = "apple";
		System.out.println(solution(before, after));
	}

	public static int solution(String before, String after) {
		int answer = 0;
		List<String> list_before = new ArrayList<>();
		for (int i = 0; i < before.length(); i++) {
			list_before.add(before.charAt(i) + "");
		}
		for (int j = 0; j < after.length(); j++) {
			for (int k = 0; k < list_before.size(); k++) {
				if (list_before.get(k).equals(after.charAt(j)+"")) {
					list_before.remove(k);
				}
			}
		}
		if (list_before.size() == 0) {
			answer = 1;
		} else {
			answer = 0;
		}

		return answer;
	}
}
