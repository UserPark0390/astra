package level0.solution;

import java.util.Arrays;

public class Programmers_OX퀴즈 {
	public static void main(String[] args) {
		String[] quiz = { "3 - 4 = -3", "5 + 6 = 11" };
		System.out.println(Arrays.toString(solution(quiz)));
	}

	public static String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		boolean yes = false;
		for (int i = 0; i < quiz.length; i++) {
			String str = quiz[i];
			String [] quiz_str = str.split(" ");
			boolean plus = true;
			boolean check = false;
			boolean equalCheck = false;
			int A = 0;
			int B = 0;
			int result = 0;
			for (int j = 0; j < quiz_str.length; j++) {
				String test = quiz_str[j].replaceAll(" ", "");
				if (quiz_str[j].equals("+")) {
					check = true;
					continue;
				} else if (quiz_str[j].equals("-")) {
					plus = false;
					check = true;
					continue;
				} else if (quiz_str[j].equals("=")) {
					equalCheck = true;
					continue;
				}
				if (!check) {
					A = Integer.parseInt(quiz_str[j]);
				} else if (check && !equalCheck) {
					B = Integer.parseInt(quiz_str[j]);
				}
				if (equalCheck) {
					result = Integer.parseInt(quiz_str[j]);
				}
			}
			if (plus) {
				if (result == A + B) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			} else {
				if (result == A - B) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			}
		}
		return answer;
	}
}
