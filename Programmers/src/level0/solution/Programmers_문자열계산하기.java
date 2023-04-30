package level0.solution;

import java.util.StringTokenizer;

public class Programmers_문자열계산하기 {
	public static void main(String[] args) {
		String my_string = "13 - 500 - 200";
		System.out.println(solution(my_string));
	}

	public static int solution(String my_string) {
		int answer = 0;
		StringTokenizer st = new StringTokenizer(my_string, " ");
		int size = st.countTokens();
		boolean plus = false;
		boolean minus = false;
		boolean check = false;
		for (int i = 0; i < size; i++) {
			String str = st.nextToken();
			if (str.equals("+") || str.equals("-")) {
				if (str.equals("+")) {
					check = true;
					plus = true;
					continue;
				} else if (str.equals("-")) {
					check = true;
					minus = true;
					continue;
				}
			}
			if (check) {
				if (plus) {
					answer = answer + Integer.parseInt(str);
					plus = false;
					check = false;
				} else if (minus) {
					answer = answer - Integer.parseInt(str);
					minus = false;
					check = false;
				}
			} else {
				answer = answer + Integer.parseInt(str);
			}

		}

		return answer;
	}
}
