package level0.solution;

import java.util.StringTokenizer;

public class Programmers_모음제거2 {
	public static void main(String[] args) {
		String my_string = "bus";
		System.out.println(solution(my_string));
	}

	public static StringBuilder solution(String my_string) {
		StringTokenizer st = new StringTokenizer(my_string);
		StringBuilder answer = new StringBuilder();
		int count = st.countTokens();
		String str = "";
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			str = st.nextToken().replace('a', '0').replace('e', ' ').replace('i', ' ').replace('o', ' ')
					.replace('u', ' ').replace(" ", "");
			if (count - i == 1) {
				answer.append(str);
			} else {
				answer.append(str).append(" ");
			}

		}
		return answer;
	}

}
